MACHINE 
	meeduse_tt2bdd

SETS
	ELEMENT

ABSTRACT_VARIABLES
	Element,
	Tree,
	Port,
	TruthTable,
	Row,
	Cell,
	Subtree,
	BDD,
	BdP,
	Assignment,
	Leaf,
	InputPort,
	OutputPort,
	BddInput,
	BddOutput,
	ttPorts,
	rows,
	cells,
	cellPort,
	bddPorts,
	treeOwner,
	treeForZero,
	treeForOne,
	subtreePorts,
	assignPort,
	assignOwner,
	Cell_value,
	Cell_done,
	Cell_selected,
	Assignment_value

INVARIANT
	Element : FIN(ELEMENT) &
	Tree <: INT &
	Port <: Element &
	TruthTable <: Element &
	Row <: Element &
	Cell <: Element &
	Subtree <: Tree &
	BDD <: Element &
	BdP <: Element &
	Assignment <: Element &
	Leaf <: Tree &
	InputPort <: Port &
	OutputPort <: Port &
	BddInput <: BdP &
	BddOutput <: BdP &
	ttPorts : Port -->> TruthTable &
	rows : Row <-> TruthTable & /*-->>*/
	cells : Cell <-> Row & /*-->>*/
	cellPort : Cell --> Port &
	bddPorts : BdP +-> BDD &
	treeOwner : Tree >+> BDD &
	treeForZero : Subtree <-> Tree & /*>->*/
	treeForOne : Subtree <-> Tree & /*>->*/
	subtreePorts : Subtree --> BddInput &
	assignPort : Assignment <-> BddOutput & /*-->*/
	assignOwner : Assignment <-> Leaf & /*-->>*/
	Cell_value : Cell --> BOOL &
	Cell_done : Cell +-> BOOL &
	Cell_selected : Cell +-> BOOL &
	Assignment_value : Assignment --> BOOL &
	Subtree /\ Leaf = {} &
	InputPort /\ OutputPort = {} &
	BddOutput /\ BddInput = {} &
	!owner.( owner : ran(ttPorts) => ttPorts~[{owner}] /= {}) &
	/*!owner.( owner : ran(rows) => card(rows~[{owner}]) >= 2) &*/
	!owner.( owner : ran(cells) => cells~[{owner}] /= {}) &
	!owner.( owner : ran(assignOwner) => assignOwner~[{owner}] /= {})

INITIALISATION
	Element := {} ||
	Tree := {} ||
	Port := {} ||
	TruthTable := {} ||
	Row := {} ||
	Cell := {} ||
	Subtree := {} ||
	BDD := {} ||
	BdP := {} ||
	Assignment := {} ||
	Leaf := {} ||
	InputPort := {} ||
	OutputPort := {} ||
	BddInput := {} ||
	BddOutput := {} ||
	ttPorts := {} ||
	rows := {} ||
	cells := {} ||
	cellPort := {} ||
	bddPorts := {} ||
	treeOwner := {} ||
	treeForZero := {} ||
	treeForOne := {} ||
	subtreePorts := {} ||
	assignPort := {} ||
	assignOwner := {} ||
	Cell_value := {} ||
	Cell_done := {} ||
	Cell_selected := {} ||
	Assignment_value := {}

OPERATIONS

Sovle =
PRE BDD={} THEN
	ANY
		genBDD,
		genBddInput, genBddOutput, genbddPorts, genBdP,
		genTree, genSubtree, genLeaf,
		genTreeForZero, genTreeForOne,
		genSubtreePorts, root
	WHERE
		genBDD = TruthTable &
		genBddInput = InputPort &
		genBddOutput = OutputPort &
		genBdP = InputPort \/ OutputPort &
		
		genTree		<: 1..card(Cell) &
		genSubtree	<: genTree &
		genSubtree 	<: 1..card(cellPort|>InputPort) &
		genLeaf		<: genTree &
		genLeaf /\ genSubtree = {} &
		card(genLeaf) 	= card(Row) &
		
		genbddPorts 	: genBdP --> genBDD &		
		
		genTreeForZero 	: genSubtree >-> genTree & 
		genTreeForOne	: genSubtree >-> genTree &
		/*id(genSubtree) /\ closure(genTreeForZero\/genTreeForOne) = {} &*/
		/*id(genSubtree) /\ genTreeForOne = {} &*/
		genSubtreePorts : genSubtree --> genBddInput &
		root 		: genSubtree &
		/*root 		/: ran(genTreeForZero \/ genTreeForOne) &*/
		(! tt . (tt : genSubtree & tt /= root 
				 	=> tt : ran(genTreeForZero \/ genTreeForOne))
		) &
		!r.(r : Row => cells~[{r}]
			# path.(path : genSubtree >+> genTree 
				 & path <: genTreeForZero \/ genTreeForOne 
				 & card(path) = (cellPort[cells~[{r}]] /\ InputPort)
				 & closure1(path) /\ id(genSubtree) = {}
				 & root : dom(path) 
				 & root /: ran(path)				 
			     & (! cell .
			     	(cell : cells~[{r}] & cellPort[{cell}] <: InputPort
			     	=> 
				     	# tt.(tt : genSubtree & tt : dom(path) &
							genSubtreePorts[{tt}] = cellPort[{cell}] &
							((Cell_value(cell) = TRUE 
								& tt : dom(path /\ genTreeForOne)) or
							(Cell_value(cell) = FALSE
								& tt : dom(path /\ genTreeForZero)))
						) 
					)
				 )
			)
		)
		
	THEN
		BDD 		:= genBDD ||
		BddInput 	:= genBddInput ||
		BddOutput 	:= genBddOutput ||
		BdP 			:= genBdP ||
		bddPorts 	:= genbddPorts ||
		Tree 		:= genTree ||
		Subtree 	:= genSubtree ||
		Leaf 		:= genLeaf ||
		treeForZero 	:= genTreeForZero ||
		treeForOne 	:= genTreeForOne ||
		subtreePorts 	:= genSubtreePorts
	END
END;
reduce =
	BEGIN
		skip
	END ;

	result <-- Port_GetOwner(aPort) = 
	PRE	aPort : Port &
		aPort : dom(ttPorts)
		
	THEN	result := ttPorts(aPort)
	END;

	result <-- Port_GetCells(aPort) = 
	PRE	aPort : Port &
		aPort : ran(cellPort)
		
	THEN	result := cellPort~[{aPort}]
	END;

	result <-- TruthTable_GetPorts(aTruthTable) = 
	PRE	aTruthTable : TruthTable &
		aTruthTable : ran(ttPorts)
		
	THEN	result := ttPorts~[{aTruthTable}]
	END;

	result <-- TruthTable_GetRows(aTruthTable) = 
	PRE	aTruthTable : TruthTable &
		aTruthTable : ran(rows)
		
	THEN	result := rows~[{aTruthTable}]
	END;

	result <-- Row_GetOwner(aRow) = 
	PRE	aRow : Row &
		aRow : dom(rows)
		
	THEN	result := rows(aRow)
	END;

	result <-- Row_GetCells(aRow) = 
	PRE	aRow : Row &
		aRow : ran(cells)
		
	THEN	result := cells~[{aRow}]
	END;

	result <-- Cell_GetOwner(aCell) = 
	PRE	aCell : Cell &
		aCell : dom(cells)
		
	THEN	result := cells(aCell)
	END;

	result <-- Cell_GetPort(aCell) = 
	PRE	aCell : Cell &
		aCell : dom(cellPort)
		
	THEN	result := cellPort(aCell)
	END;

	result <-- Subtree_GetTreeForZero(aSubtree) = 
	PRE	aSubtree : Subtree &
		aSubtree : dom(treeForZero)
		
	THEN	result := treeForZero(aSubtree)
	END;

	result <-- Subtree_GetTreeForOne(aSubtree) = 
	PRE	aSubtree : Subtree &
		aSubtree : dom(treeForOne)
		
	THEN	result := treeForOne(aSubtree)
	END;

	result <-- Subtree_GetPort(aSubtree) = 
	PRE	aSubtree : Subtree &
		aSubtree : dom(subtreePorts)
		
	THEN	result := subtreePorts(aSubtree)
	END;

	result <-- Tree_GetOwnerBDD(aTree) = 
	PRE	aTree : Tree &
		aTree : dom(treeOwner)
		
	THEN	result := treeOwner(aTree)
	END;

	result <-- Tree_GetOwnerSubtreeForZero(aTree) = 
	PRE	aTree : Tree &
		aTree : ran(treeForZero)
		
	THEN	result := treeForZero~(aTree)
	END;

	result <-- Tree_GetOwnerSubtreeForOne(aTree) = 
	PRE	aTree : Tree &
		aTree : ran(treeForOne)
		
	THEN	result := treeForOne~(aTree)
	END;

	result <-- BDD_GetPorts(aBDD) = 
	PRE	aBDD : BDD &
		aBDD : ran(bddPorts)
		
	THEN	result := bddPorts~[{aBDD}]
	END;

	result <-- BDD_GetTree(aBDD) = 
	PRE	aBDD : BDD &
		aBDD : ran(treeOwner)
		
	THEN	result := treeOwner~(aBDD)
	END;

	result <-- BdP_GetOwner(aBdP) = 
	PRE	aBdP : BdP &
		aBdP : dom(bddPorts)
		
	THEN	result := bddPorts(aBdP)
	END;

	result <-- BddInput_GetSubtrees(aBddInput) = 
	PRE	aBddInput : BddInput &
		aBddInput : ran(subtreePorts)
		
	THEN	result := subtreePorts~[{aBddInput}]
	END;

	result <-- Assignment_GetPort(aAssignment) = 
	PRE	aAssignment : Assignment &
		aAssignment : dom(assignPort)
		
	THEN	result := assignPort(aAssignment)
	END;

	result <-- Assignment_GetOwner(aAssignment) = 
	PRE	aAssignment : Assignment &
		aAssignment : dom(assignOwner)
		
	THEN	result := assignOwner(aAssignment)
	END;

	result <-- BddOutput_GetAssignments(aBddOutput) = 
	PRE	aBddOutput : BddOutput &
		aBddOutput : ran(assignPort)
		
	THEN	result := assignPort~[{aBddOutput}]
	END;

	result <-- Leaf_GetAssignments(aLeaf) = 
	PRE	aLeaf : Leaf &
		aLeaf : ran(assignOwner)
		
	THEN	result := assignOwner~[{aLeaf}]
	END;

	result <-- Cell_GetValue(aCell) = 
	PRE	aCell : Cell &
		aCell : dom(Cell_value)
		
	THEN	result := Cell_value(aCell)
	END;

	result <-- Cell_GetDone(aCell) = 
	PRE	aCell : Cell &
		aCell : dom(Cell_done)
		
	THEN	result := Cell_done(aCell)
	END;

	result <-- Cell_GetSelected(aCell) = 
	PRE	aCell : Cell &
		aCell : dom(Cell_selected)
		
	THEN	result := Cell_selected(aCell)
	END;

	result <-- Assignment_GetValue(aAssignment) = 
	PRE	aAssignment : Assignment &
		aAssignment : dom(Assignment_value)
		
	THEN	result := Assignment_value(aAssignment)
	END
END
