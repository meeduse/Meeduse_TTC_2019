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
	Assignment_value,
lastTree

INVARIANT
lastTree : NAT &
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
lastTree := 0 ||
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

setLastTree(val) = PRE val : NAT THEN lastTree := val END ;

TruthTable_NEW(aTruthTable,thePorts,theRows) = 
	PRE	aTruthTable : ELEMENT &
		thePorts : POW(Port) &
		theRows : POW(Row) &
		aTruthTable /: Element &
		thePorts /= {} &
		!aPorts.( aPorts : thePorts => ttPorts[{aPorts}] = {}) &
		card(theRows) >= 2 &
		!aRows.( aRows : theRows => rows[{aRows}] = {})
		
	THEN	TruthTable := TruthTable \/ {aTruthTable} ||
			Element := Element \/ {aTruthTable} ||
			ttPorts := ttPorts \/ (thePorts * {aTruthTable}) ||
			rows := rows \/ (theRows * {aTruthTable})
	END;

	Row_NEW(aRow,aOwner,theCells) = 
	PRE	aRow : ELEMENT &
		aOwner : TruthTable &
		theCells : POW(Cell) &
		aRow /: Element &
		theCells /= {} &
		!aCells.( aCells : theCells => cells[{aCells}] = {})
		
	THEN	Row := Row \/ {aRow} ||
			Element := Element \/ {aRow} ||
			rows := rows \/ {(aRow |-> aOwner)} ||
			cells := cells \/ (theCells * {aRow})
	END;

	Cell_NEW(aCell,aOwner,aPort,aValue) = 
	PRE	aCell : ELEMENT &
		aOwner : Row &
		aPort : Port &
		aValue : BOOL &
		aCell /: Element
		
	THEN	Cell := Cell \/ {aCell} ||
			Element := Element \/ {aCell} ||
			cells := cells \/ {(aCell |-> aOwner)} ||
			cellPort := cellPort \/ {(aCell |-> aPort)} ||
			Cell_value := Cell_value \/ {(aCell |-> aValue)}
	END;

	/*Subtree_NEW(aTreeForZero,aTreeForOne,aPort) = 
	PRE	
		aTreeForZero : Tree &
		aTreeForOne : Tree &
		aPort : BddInput &
		
		treeForZero~[{aTreeForZero}] = {} &
		treeForOne~[{aTreeForOne}] = {}
		
	THEN	Subtree := Subtree \/ {last} ||
			Tree := Tree \/ {last} ||
			treeForZero := treeForZero \/ {(last |-> aTreeForZero)} ||
			treeForOne := treeForOne \/ {(last |-> aTreeForOne)} ||
			subtreePorts := subtreePorts \/ {(last |-> aPort)} ||
			last := last + 1
	END;*/
	
	Subtree_NEW(aPort) = 
	PRE	
		aPort : BddInput 
		
	THEN	Subtree := Subtree \/ {lastTree + 1} ||
		Tree := Tree \/ {lastTree + 1} ||
		subtreePorts := subtreePorts \/ {(lastTree + 1 |-> aPort)} ||
		lastTree := lastTree + 1
	END;

	Leaf_NEW = 
	BEGIN
		Leaf := Leaf \/ {lastTree + 1} ||
		Tree := Tree \/ {lastTree + 1} ||
		lastTree := lastTree + 1
	END;

	Leafs_NEW(theLeafs) = 
	PRE
		theLeafs <: NAT
	THEN
		Leaf := Leaf \/ theLeafs ||
		Tree := theLeafs ||
		lastTree := card(theLeafs)
	END;

	BDD_NEW(aBDD) = 
	PRE	
		aBDD : Element	& aBDD /: BDD	
	THEN	
		BDD := BDD \/ {aBDD}
	END;

	Assignment_NEW(aAssignment, aPort, aValue) = 
	PRE	
		aPort : BddOutput &
		aValue : BOOL &
		aAssignment : Element
		
	THEN	Assignment := Assignment \/ {aAssignment} ||
		assignPort := assignPort \/ {(aAssignment |-> aPort)} ||
		Assignment_value(aAssignment) := aValue
	END;

	Assignments_NEW(theAssignments) = 
	PRE	
		theAssignments <: Element
		
	THEN	Assignment := Assignment \/ theAssignments
	END;

	/*Assignment_NEW(aAssignment,aPort,aOwner,aValue) = 
	PRE	aAssignment : ELEMENT &
		aPort : BddOutput &
		aOwner : Leaf &
		aValue : BOOL &
		aAssignment /: Element
		
	THEN	Assignment := Assignment \/ {aAssignment} ||
			Element := Element \/ {aAssignment} ||
			assignPort := assignPort \/ {(aAssignment |-> aPort)} ||
			assignOwner := assignOwner \/ {(aAssignment |-> aOwner)} ||
			Assignment_value := Assignment_value \/ {(aAssignment |-> aValue)}
	END;*/

	/*Leaf_NEW(aLeaf,theAssignments) = 
	PRE	aLeaf : NAT &
		aLeaf = last + 1 &
		theAssignments : POW(Assignment) &
		aLeaf /: Tree &
		theAssignments /= {} &
		!aAssignments.( aAssignments : theAssignments => assignOwner[{aAssignments}] = {})
		
	THEN	Leaf := Leaf \/ {aLeaf} ||
			Tree := Tree \/ {aLeaf} ||
			assignOwner := assignOwner \/ (theAssignments * {aLeaf})
	END;

	Leaf_NEW(aPort) = 
	PRE	
		aPort : BddInput 
		
	THEN	Subtree := Subtree \/ {last} ||
		subtreePorts := subtreePorts \/ {(last |-> aPort)} ||
		last := last + 1
	END;*/

	

	InputPort_NEW(aInputPort,aOwner) = 
	PRE	aInputPort : ELEMENT &
		aOwner : TruthTable &
		aInputPort /: Element
		
	THEN	InputPort := InputPort \/ {aInputPort} ||
			Element := Element \/ {aInputPort} ||
			Port := Port \/ {aInputPort} ||
			ttPorts := ttPorts \/ {(aInputPort |-> aOwner)}
	END;

	OutputPort_NEW(aOutputPort,aOwner) = 
	PRE	aOutputPort : ELEMENT &
		aOwner : TruthTable &
		aOutputPort /: Element
		
	THEN	OutputPort := OutputPort \/ {aOutputPort} ||
			Element := Element \/ {aOutputPort} ||
			Port := Port \/ {aOutputPort} ||
			ttPorts := ttPorts \/ {(aOutputPort |-> aOwner)}
	END;

BddInput_NEW(aBddInput) = 
	PRE	aBddInput <: ELEMENT 
		
	THEN	BddInput := BddInput \/ aBddInput ||
		BdP := BdP \/ aBddInput
	END;

BddOutput_NEW(aBddOutput) = 
	PRE	aBddOutput <: ELEMENT 
		
	THEN	BddOutput := BddOutput \/ aBddOutput ||
		BdP := BdP \/ aBddOutput
	END;

BDD_Addports(aBDD, theBddports) = 
	PRE	aBDD : BDD &
		theBddports <: ELEMENT 
		
	THEN	bddPorts := bddPorts \/ (theBddports * {aBDD})
	END;

	TruthTable_Free(aTruthTable) = 
	PRE	aTruthTable : TruthTable &
		ttPorts~[{aTruthTable}] = {} &
		rows~[{aTruthTable}] = {}
		
	THEN	TruthTable := TruthTable - {aTruthTable} ||
			Element := Element - {aTruthTable} ||
			ttPorts := ttPorts |>> {aTruthTable} ||
			rows := rows |>> {aTruthTable}
	END;

	Row_Free(aRow) = 
	PRE	aRow : Row 
		
	THEN	Row := Row - {aRow} ||
			Element := Element - {aRow} ||
			rows := {aRow} <<| rows/* ||
			cells := cells |>> {aRow}*/
	END;

	Cell_Free(aCell) = 
	PRE	aCell : Cell &
		!owner.( owner : cells[{aCell}] => card(cells~[{owner}]) >= 2)
		
	THEN	Cell := Cell - {aCell} ||
			Element := Element - {aCell} ||
			cells := {aCell} <<| cells ||
			cellPort := {aCell} <<| cellPort ||
			Cell_value := {aCell} <<| Cell_value ||
			Cell_done := {aCell} <<| Cell_done ||
			Cell_selected := {aCell} <<| Cell_selected
	END;
	

Cells_Free(theCells) = 
	PRE	
		theCells <: Cell 
	THEN	
		Cell := Cell - theCells ||
		cells := theCells <<| cells ||
		cellPort := theCells <<| cellPort ||
		Cell_value := theCells <<| Cell_value ||
		Cell_done := theCells <<| Cell_done ||
		Cell_selected := theCells <<| Cell_selected
	END;

	Subtree_Free(aSubtree) = 
	PRE	aSubtree : Subtree &
		treeForZero~[{aSubtree}] = {} &
		treeForOne~[{aSubtree}] = {}
		
	THEN	Subtree := Subtree - {aSubtree} ||
			Tree := Tree - {aSubtree} ||
			treeForZero := {aSubtree} <<| (treeForZero |>> {aSubtree}) ||
			treeForOne := {aSubtree} <<| (treeForOne |>> {aSubtree}) ||
			subtreePorts := {aSubtree} <<| subtreePorts ||
			treeOwner := {aSubtree} <<| treeOwner
	END;

	BDD_Free(aBDD) = 
	PRE	aBDD : BDD
		
	THEN	BDD := BDD - {aBDD} ||
			Element := Element - {aBDD} ||
			bddPorts := bddPorts |>> {aBDD} ||
			treeOwner := treeOwner |>> {aBDD}
	END;

	Assignment_Free(aAssignment) = 
	PRE	aAssignment : Assignment &
		!owner.( owner : assignOwner[{aAssignment}] => card(assignOwner~[{owner}]) >= 2)
		
	THEN	Assignment := Assignment - {aAssignment} ||
			Element := Element - {aAssignment} ||
			assignPort := {aAssignment} <<| assignPort ||
			assignOwner := {aAssignment} <<| assignOwner ||
			Assignment_value := {aAssignment} <<| Assignment_value
	END;

	Leaf_Free(aLeaf) = 
	PRE	aLeaf : Leaf &
		treeForZero~[{aLeaf}] = {} &
		treeForOne~[{aLeaf}] = {} &
		assignOwner~[{aLeaf}] = {}
		
	THEN	Leaf := Leaf - {aLeaf} ||
			Tree := Tree - {aLeaf} ||
			treeOwner := {aLeaf} <<| treeOwner ||
			treeForZero := treeForZero |>> {aLeaf} ||
			treeForOne := treeForOne |>> {aLeaf} ||
			assignOwner := assignOwner |>> {aLeaf}
	END;

	InputPort_Free(aInputPort) = 
	PRE	aInputPort : InputPort &
		!owner.( owner : ttPorts[{aInputPort}] => card(ttPorts~[{owner}]) >= 2) &
		cellPort~[{aInputPort}] = {}
		
	THEN	InputPort := InputPort - {aInputPort} ||
			Element := Element - {aInputPort} ||
			Port := Port - {aInputPort} ||
			ttPorts := {aInputPort} <<| ttPorts ||
			cellPort := cellPort |>> {aInputPort}
	END;

	OutputPort_Free(aOutputPort) = 
	PRE	aOutputPort : OutputPort &
		!owner.( owner : ttPorts[{aOutputPort}] => card(ttPorts~[{owner}]) >= 2) &
		cellPort~[{aOutputPort}] = {}
		
	THEN	OutputPort := OutputPort - {aOutputPort} ||
			Element := Element - {aOutputPort} ||
			Port := Port - {aOutputPort} ||
			ttPorts := {aOutputPort} <<| ttPorts ||
			cellPort := cellPort |>> {aOutputPort}
	END;

	BddInput_Free(aBddInput) = 
	PRE	aBddInput : BddInput &
		subtreePorts~[{aBddInput}] = {}
		
	THEN	BddInput := BddInput - {aBddInput} ||
			BdP := BdP - {aBddInput} ||
			Element := Element - {aBddInput} ||
			bddPorts := {aBddInput} <<| bddPorts ||
			subtreePorts := subtreePorts |>> {aBddInput}
	END;

	BddOutput_Free(aBddOutput) = 
	PRE	aBddOutput : BddOutput &
		assignPort~[{aBddOutput}] = {}
		
	THEN	BddOutput := BddOutput - {aBddOutput} ||
			BdP := BdP - {aBddOutput} ||
			Element := Element - {aBddOutput} ||
			bddPorts := {aBddOutput} <<| bddPorts ||
			assignPort := assignPort |>> {aBddOutput}
	END;

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

	Port_SetOwner(aPort,aOwner) = 
	PRE	aPort : Port &
		aOwner : TruthTable &
		{(aPort |-> aOwner)} /<: ttPorts &
		!removed.( removed : ttPorts[{aPort}] => card(ttPorts~[{removed}]) >= 2)
		
	THEN	ttPorts := ({aPort} <<| ttPorts) \/ {(aPort |-> aOwner)}
	END;

	Port_SetCells(aPort,theCells) = 
	PRE	aPort : Port &
		theCells : POW(Cell) &
		(theCells * {aPort}) /<: cellPort &
		cellPort~[{aPort}] = {} &
		!added.( added : theCells => cellPort[{added}] = {})
		
	THEN	cellPort := (cellPort |>> {aPort}) \/ (theCells * {aPort})
	END;

	TruthTable_SetPorts(aTruthTable,thePorts) = 
	PRE	aTruthTable : TruthTable &
		thePorts : POW(Port) &
		(thePorts * {aTruthTable}) /<: ttPorts &
		ttPorts~[{aTruthTable}] = {} &
		thePorts /= {} &
		!added.( added : thePorts => ttPorts[{added}] = {})
		
	THEN	ttPorts := (ttPorts |>> {aTruthTable}) \/ (thePorts * {aTruthTable})
	END;

	TruthTable_SetRows(aTruthTable,theRows) = 
	PRE	aTruthTable : TruthTable &
		theRows : POW(Row) &
		(theRows * {aTruthTable}) /<: rows &
		rows~[{aTruthTable}] = {} &
		card(theRows) >= 2 &
		!added.( added : theRows => rows[{added}] = {})
		
	THEN	rows := (rows |>> {aTruthTable}) \/ (theRows * {aTruthTable})
	END;

	Row_SetOwner(aRow,aOwner) = 
	PRE	aRow : Row &
		aOwner : TruthTable &
		{(aRow |-> aOwner)} /<: rows &
		!removed.( removed : rows[{aRow}] => card(rows~[{removed}]) >= 3)
		
	THEN	rows := ({aRow} <<| rows) \/ {(aRow |-> aOwner)}
	END;

	Row_SetCells(aRow,theCells) = 
	PRE	aRow : Row &
		theCells : POW(Cell) &
		(theCells * {aRow}) /<: cells &
		cells~[{aRow}] = {} &
		theCells /= {} &
		!added.( added : theCells => cells[{added}] = {})
		
	THEN	cells := (cells |>> {aRow}) \/ (theCells * {aRow})
	END;

	Cell_SetOwner(aCell,aOwner) = 
	PRE	aCell : Cell &
		aOwner : Row &
		{(aCell |-> aOwner)} /<: cells &
		!removed.( removed : cells[{aCell}] => card(cells~[{removed}]) >= 2)
		
	THEN	cells := ({aCell} <<| cells) \/ {(aCell |-> aOwner)}
	END;

	Cell_SetPort(aCell,aPort) = 
	PRE	aCell : Cell &
		aPort : Port &
		{(aCell |-> aPort)} /<: cellPort
		
	THEN	cellPort := ({aCell} <<| cellPort) \/ {(aCell |-> aPort)}
	END;

	Subtree_SetTreeForZero(aSubtree,aTreeForZero) = 
	PRE	aSubtree : Subtree &
		aTreeForZero : Tree 
		
	THEN	treeForZero := ({aSubtree} <<| treeForZero) \/ {(aSubtree |-> aTreeForZero)}
	END;

	Subtree_SetTreeForOne(aSubtree,aTreeForOne) = 
	PRE	aSubtree : Subtree &
		aTreeForOne : Tree
		
	THEN	treeForOne := ({aSubtree} <<| treeForOne) \/ {(aSubtree |-> aTreeForOne)}
	END;

	Subtree_SetPort(aSubtree,aPort) = 
	PRE	aSubtree : Subtree &
		aPort : BddInput &
		{(aSubtree |-> aPort)} /<: subtreePorts
		
	THEN	subtreePorts := ({aSubtree} <<| subtreePorts) \/ {(aSubtree |-> aPort)}
	END;

	Tree_SetOwnerBDD(aTree,aOwnerBDD) = 
	PRE	aTree : Tree &
		aOwnerBDD : BDD &
		{(aTree |-> aOwnerBDD)} /<: treeOwner &
		!added.( added : {aOwnerBDD} => treeOwner~[{added}] = {})
		
	THEN	
		treeOwner := ({aTree} <<| treeOwner) \/ {(aTree |-> aOwnerBDD)}
	END;

	Tree_SetOwnerSubtreeForZero(aTree,aOwnerSubtreeForZero) = 
	PRE	aTree : Tree &
		aOwnerSubtreeForZero : Subtree &
		{(aOwnerSubtreeForZero |-> aTree)} /<: treeForZero &
		treeForZero~[{aTree}] = {} &
		!added.( added : {aOwnerSubtreeForZero} => treeForZero[{added}] = {})
		
	THEN	treeForZero := (treeForZero |>> {aTree}) \/ {(aOwnerSubtreeForZero |-> aTree)}
	END;

	Tree_SetOwnerSubtreeForOne(aTree,aOwnerSubtreeForOne) = 
	PRE	aTree : Tree &
		aOwnerSubtreeForOne : Subtree &
		{(aOwnerSubtreeForOne |-> aTree)} /<: treeForOne &
		treeForOne~[{aTree}] = {} &
		!added.( added : {aOwnerSubtreeForOne} => treeForOne[{added}] = {})
		
	THEN	treeForOne := (treeForOne |>> {aTree}) \/ {(aOwnerSubtreeForOne |-> aTree)}
	END;

	BDD_SetPorts(aBDD,thePorts) = 
	PRE	aBDD : BDD &
		thePorts : POW(BdP) &
		(thePorts * {aBDD}) /<: bddPorts &
		!added.( added : thePorts => bddPorts[{added}] = {})
		
	THEN	bddPorts := (bddPorts |>> {aBDD}) \/ (thePorts * {aBDD})
	END;

	BDD_SetTree(aBDD,aTree) = 
	PRE	aBDD : BDD &
		aTree : Tree &
		{(aTree |-> aBDD)} /<: treeOwner &
		!added.( added : {aTree} => treeOwner[{added}] = {})
		
	THEN	treeOwner := (treeOwner |>> {aBDD}) \/ {(aTree |-> aBDD)}
	END;

	BdP_SetOwner(aBdP,aOwner) = 
	PRE	aBdP : BdP &
		aOwner : BDD &
		{(aBdP |-> aOwner)} /<: bddPorts
		
	THEN	bddPorts := ({aBdP} <<| bddPorts) \/ {(aBdP |-> aOwner)}
	END;

	BddInput_SetSubtrees(aBddInput,theSubtrees) = 
	PRE	aBddInput : BddInput &
		theSubtrees : POW(Subtree) &
		(theSubtrees * {aBddInput}) /<: subtreePorts &
		subtreePorts~[{aBddInput}] = {} &
		!added.( added : theSubtrees => subtreePorts[{added}] = {})
		
	THEN	subtreePorts := (subtreePorts |>> {aBddInput}) \/ (theSubtrees * {aBddInput})
	END;

	Assignment_SetPort(aAssignment,aPort) = 
	PRE	aAssignment : Assignment &
		aPort : BddOutput &
		{(aAssignment |-> aPort)} /<: assignPort
		
	THEN	assignPort := ({aAssignment} <<| assignPort) \/ {(aAssignment |-> aPort)}
	END;

	Assignment_SetOwner(aAssignment,aOwner) = 
	PRE	aAssignment : Assignment &
		aOwner : Leaf &
		{(aAssignment |-> aOwner)} /<: assignOwner &
		!removed.( removed : assignOwner[{aAssignment}] => card(assignOwner~[{removed}]) >= 2)
		
	THEN	assignOwner := ({aAssignment} <<| assignOwner) \/ {(aAssignment |-> aOwner)}
	END;

	Assignments_SetOwner(theAssignments, aOwner) = 
	PRE	theAssignments <: Assignment &
		aOwner : Leaf 
	THEN	
		assignOwner := assignOwner \/ theAssignments * {aOwner}
	END;


	BddOutput_SetAssignments(aBddOutput,theAssignments) = 
	PRE	aBddOutput : BddOutput &
		theAssignments : POW(Assignment) &
		(theAssignments * {aBddOutput}) /<: assignPort &
		assignPort~[{aBddOutput}] = {} &
		!added.( added : theAssignments => assignPort[{added}] = {})
		
	THEN	assignPort := (assignPort |>> {aBddOutput}) \/ (theAssignments * {aBddOutput})
	END;

	Leaf_SetAssignments(aLeaf,theAssignments) = 
	PRE	aLeaf : Leaf &
		theAssignments : POW(Assignment) &
		(theAssignments * {aLeaf}) /<: assignOwner &
		assignOwner~[{aLeaf}] = {} &
		theAssignments /= {} &
		!added.( added : theAssignments => assignOwner[{added}] = {})
		
	THEN	assignOwner := (assignOwner |>> {aLeaf}) \/ (theAssignments * {aLeaf})
	END;

	Port_UnsetCells(aPort) = 
	PRE	aPort : Port &
		cellPort~[{aPort}] = {}
		
	THEN	cellPort := cellPort |>> {aPort}
	END;

	Tree_UnsetOwnerBDD(aTree) = 
	PRE	aTree : Tree
		
	THEN	treeOwner := {aTree} <<| treeOwner
	END;

	Tree_UnsetOwnerSubtreeForZero(aTree) = 
	PRE	aTree : Tree &
		treeForZero~[{aTree}] = {}
		
	THEN	treeForZero := treeForZero |>> {aTree}
	END;

	Tree_UnsetOwnerSubtreeForOne(aTree) = 
	PRE	aTree : Tree &
		treeForOne~[{aTree}] = {}
		
	THEN	treeForOne := treeForOne |>> {aTree}
	END;

	BDD_UnsetPorts(aBDD) = 
	PRE	aBDD : BDD
		
	THEN	bddPorts := bddPorts |>> {aBDD}
	END;

	BDD_UnsetTree(aBDD) = 
	PRE	aBDD : BDD
		
	THEN	treeOwner := treeOwner |>> {aBDD}
	END;

	BdP_UnsetOwner(aBdP) = 
	PRE	aBdP : BdP
		
	THEN	bddPorts := {aBdP} <<| bddPorts
	END;

	BddInput_UnsetSubtrees(aBddInput) = 
	PRE	aBddInput : BddInput &
		subtreePorts~[{aBddInput}] = {}
		
	THEN	subtreePorts := subtreePorts |>> {aBddInput}
	END;

	BddOutput_UnsetAssignments(aBddOutput) = 
	PRE	aBddOutput : BddOutput &
		assignPort~[{aBddOutput}] = {}
		
	THEN	assignPort := assignPort |>> {aBddOutput}
	END;

	Port_AddCells(aPort,aCells) = 
	PRE	aPort : Port &
		aCells : Cell &
		(aCells |-> aPort) /: cellPort &
		cellPort[{aCells}] = {}
		
	THEN	cellPort := cellPort \/ {(aCells |-> aPort)}
	END;

	TruthTable_AddPorts(aTruthTable,aPorts) = 
	PRE	aTruthTable : TruthTable &
		aPorts : Port &
		(aPorts |-> aTruthTable) /: ttPorts &
		ttPorts[{aPorts}] = {}
		
	THEN	ttPorts := ttPorts \/ {(aPorts |-> aTruthTable)}
	END;

	TruthTable_AddRows(aTruthTable,aRows) = 
	PRE	aTruthTable : TruthTable &
		aRows : Row &
		(aRows |-> aTruthTable) /: rows &
		rows[{aRows}] = {}
		
	THEN	rows := rows \/ {(aRows |-> aTruthTable)}
	END;

	Row_AddCells(aRow,aCells) = 
	PRE	aRow : Row &
		aCells : Cell &
		(aCells |-> aRow) /: cells &
		cells[{aCells}] = {}
		
	THEN	cells := cells \/ {(aCells |-> aRow)}
	END;

	BDD_AddPorts(aBDD,aPorts) = 
	PRE	aBDD : BDD &
		aPorts : BdP &
		(aPorts |-> aBDD) /: bddPorts &
		bddPorts[{aPorts}] = {}
		
	THEN	bddPorts := bddPorts \/ {(aPorts |-> aBDD)}
	END;

	BddInput_AddSubtrees(aBddInput,aSubtrees) = 
	PRE	aBddInput : BddInput &
		aSubtrees : Subtree &
		(aSubtrees |-> aBddInput) /: subtreePorts &
		subtreePorts[{aSubtrees}] = {}
		
	THEN	subtreePorts := subtreePorts \/ {(aSubtrees |-> aBddInput)}
	END;

	BddOutput_AddAssignments(aBddOutput,aAssignments) = 
	PRE	aBddOutput : BddOutput &
		aAssignments : Assignment &
		(aAssignments |-> aBddOutput) /: assignPort &
		assignPort[{aAssignments}] = {}
		
	THEN	assignPort := assignPort \/ {(aAssignments |-> aBddOutput)}
	END;

	Leaf_AddAssignments(aLeaf,aAssignments) = 
	PRE	aLeaf : Leaf &
		aAssignments : Assignment &
		(aAssignments |-> aLeaf) /: assignOwner &
		assignOwner[{aAssignments}] = {}
		
	THEN	assignOwner := assignOwner \/ {(aAssignments |-> aLeaf)}
	END;

	Port_RemoveCells(aPort,aCells) = 
	PRE	aPort : Port &
		aCells : Cell &
		(aCells |-> aPort) : cellPort &
		card(cellPort[{aCells}]) >= 2
		
	THEN	cellPort := cellPort - {(aCells |-> aPort)}
	END;

	TruthTable_RemovePorts(aTruthTable,aPorts) = 
	PRE	aTruthTable : TruthTable &
		aPorts : Port &
		(aPorts |-> aTruthTable) : ttPorts &
		card(ttPorts~[{aTruthTable}]) >= 2 &
		card(ttPorts[{aPorts}]) >= 2
		
	THEN	ttPorts := ttPorts - {(aPorts |-> aTruthTable)}
	END;

	TruthTable_RemoveRows(aTruthTable,aRows) = 
	PRE	aTruthTable : TruthTable &
		aRows : Row &
		(aRows |-> aTruthTable) : rows &
		card(rows~[{aTruthTable}]) >= 3 &
		card(rows[{aRows}]) >= 2
		
	THEN	rows := rows - {(aRows |-> aTruthTable)}
	END;

	Row_RemoveCells(aRow,aCells) = 
	PRE	aRow : Row &
		aCells : Cell &
		(aCells |-> aRow) : cells &
		card(cells~[{aRow}]) >= 2 &
		card(cells[{aCells}]) >= 2
		
	THEN	cells := cells - {(aCells |-> aRow)}
	END;

	Tree_RemoveOwnerBDD(aTree,aOwnerBDD) = 
	PRE	aTree : Tree &
		aOwnerBDD : BDD &
		(aTree |-> aOwnerBDD) : treeOwner
		
	THEN	treeOwner := treeOwner - {(aTree |-> aOwnerBDD)}
	END;

	Tree_RemoveOwnerSubtreeForZero(aTree,aOwnerSubtreeForZero) = 
	PRE	aTree : Tree &
		aOwnerSubtreeForZero : Subtree &
		(aOwnerSubtreeForZero |-> aTree) : treeForZero &
		card(treeForZero[{aOwnerSubtreeForZero}]) >= 2
		
	THEN	treeForZero := treeForZero - {(aOwnerSubtreeForZero |-> aTree)}
	END;

	Tree_RemoveOwnerSubtreeForOne(aTree,aOwnerSubtreeForOne) = 
	PRE	aTree : Tree &
		aOwnerSubtreeForOne : Subtree &
		(aOwnerSubtreeForOne |-> aTree) : treeForOne &
		card(treeForOne[{aOwnerSubtreeForOne}]) >= 2
		
	THEN	treeForOne := treeForOne - {(aOwnerSubtreeForOne |-> aTree)}
	END;

	BDD_RemovePorts(aBDD,aPorts) = 
	PRE	aBDD : BDD &
		aPorts : BdP &
		(aPorts |-> aBDD) : bddPorts
		
	THEN	bddPorts := bddPorts - {(aPorts |-> aBDD)}
	END;

	BDD_RemoveTree(aBDD,aTree) = 
	PRE	aBDD : BDD &
		aTree : Tree &
		(aTree |-> aBDD) : treeOwner
		
	THEN	treeOwner := treeOwner - {(aTree |-> aBDD)}
	END;

	BdP_RemoveOwner(aBdP,aOwner) = 
	PRE	aBdP : BdP &
		aOwner : BDD &
		(aBdP |-> aOwner) : bddPorts
		
	THEN	bddPorts := bddPorts - {(aBdP |-> aOwner)}
	END;

	BddInput_RemoveSubtrees(aBddInput,aSubtrees) = 
	PRE	aBddInput : BddInput &
		aSubtrees : Subtree &
		(aSubtrees |-> aBddInput) : subtreePorts &
		card(subtreePorts[{aSubtrees}]) >= 2
		
	THEN	subtreePorts := subtreePorts - {(aSubtrees |-> aBddInput)}
	END;

	BddOutput_RemoveAssignments(aBddOutput,aAssignments) = 
	PRE	aBddOutput : BddOutput &
		aAssignments : Assignment &
		(aAssignments |-> aBddOutput) : assignPort &
		card(assignPort[{aAssignments}]) >= 2
		
	THEN	assignPort := assignPort - {(aAssignments |-> aBddOutput)}
	END;

	Leaf_RemoveAssignments(aLeaf,aAssignments) = 
	PRE	aLeaf : Leaf &
		aAssignments : Assignment &
		(aAssignments |-> aLeaf) : assignOwner &
		card(assignOwner~[{aLeaf}]) >= 2 &
		card(assignOwner[{aAssignments}]) >= 2
		
	THEN	assignOwner := assignOwner - {(aAssignments |-> aLeaf)}
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
	END;

	Cell_SetValue(aCell,aValue) = 
	PRE	aCell : Cell &
		aValue : BOOL
		
	THEN	Cell_value := ({aCell} <<| Cell_value)  \/ {(aCell |-> aValue)}
	END;

	Cell_SetDone(aCell,aDone) = 
	PRE	aCell : Cell &
		aDone : BOOL
		
	THEN	Cell_done := ({aCell} <<| Cell_done)  \/ {(aCell |-> aDone)}
	END;

	Cells_SetDone(theCells, aDone) = 
	PRE	theCells <: Cell &
		aDone : BOOL
		
	THEN	Cell_done := Cell_done <+ theCells * {aDone}
	END;

	Cell_SetSelected(aCell,aSelected) = 
	PRE	aCell : Cell &
		aSelected : BOOL
		
	THEN	Cell_selected := ({aCell} <<| Cell_selected)  \/ {(aCell |-> aSelected)}
	END;

	Cells_SetSelected(theCells, aSelected) = 
	PRE	theCells <: Cell &
		theCells /= {} &
		aSelected : BOOL
		
	THEN	Cell_selected := Cell_selected <+ theCells * {aSelected}
	END;

	Assignment_SetValue(aAssignment,aValue) = 
	PRE	aAssignment : Assignment &
		aValue : BOOL
		
	THEN	Assignment_value := ({aAssignment} <<| Assignment_value)  \/ {(aAssignment |-> aValue)}
	END;

	Cell_UnsetDone(aCell) = 
	PRE	aCell : Cell
		
	THEN	Cell_done := {aCell} <<| Cell_done
	END;

	Cell_UnsetSelected(aCell) = 
	PRE	aCell : Cell
		
	THEN	Cell_selected := {aCell} <<| Cell_selected
	END;

	Cell_RemoveDone(aCell,aDone) = 
	PRE	aCell : Cell &
		aDone : BOOL &
		(aCell |-> aDone) : Cell_done
		
	THEN	Cell_done := Cell_done - {(aCell |-> aDone)}
	END;

	Cell_RemoveSelected(aCell,aSelected) = 
	PRE	aCell : Cell &
		aSelected : BOOL &
		(aCell |-> aSelected) : Cell_selected
		
	THEN	Cell_selected := Cell_selected - {(aCell |-> aSelected)}
	END
END
