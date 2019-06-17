MACHINE
	meeduse_tt2bddmain
OPERATIONS
TruthTable2BDD =
	BEGIN
		skip
	END;

Port2Port =
	BEGIN
		skip
	END ;

SelectPort = 
	BEGIN
		skip
	END;

/*SelectNewPort = 
	BEGIN
		skip
	END;
SelectCell = 
	BEGIN
		skip
	END;*/

Transform =
	BEGIN
		skip
	END ;
Continue =
	BEGIN
		skip
	END ;

setLinks =
	BEGIN
		skip
	END
END

/*

index <-- Subtree_NEW(aPort) = 
	PRE	
		aPort : BddInput 
		
	THEN	Subtree := Subtree \/ {last} ||
		subtreePorts := subtreePorts \/ {(last |-> aPort)} ||
		last := last + 1 ||
		index <-- last
	END;

BDD_NEW(aBDD) = 
	PRE	
		aBDD : Element	& aBDD /: BDD	
	THEN	
		BDD := BDD \/ {aBDD}
	END;

BDD_Addports(aBDD, theBddports) = 
	PRE	aBDD : BDD &
		theBddports <: ELEMENT 
		
	THEN	bddPorts := bddPorts \/ (theBddports * {aBDD})
	END;

Cells_SetSelected(theCells, aSelected) = 
	PRE	theCells <: Cell &
		aSelected : BOOL
		
	THEN	Cell_selected := Cell_selected <+ theCells * {aSelected}
	END;

BddInput_NEW(aBddInput) = 
	PRE	aBddInput <: ELEMENT &
		aBddInput /\ BddInput = {}
		
	THEN	BddInput := BddInput \/ aBddInput ||
		BdP := BdP \/ aBddInput
	END;

BddOutput_NEW(aBddOutput) = 
	PRE	aBddOutput <: ELEMENT &
		aBddOutput /\ BddOutput ={}
		
	THEN	BddOutput := BddOutput \/ aBddOutput ||
		BdP := BdP \/ aBddOutput
	END;
*/