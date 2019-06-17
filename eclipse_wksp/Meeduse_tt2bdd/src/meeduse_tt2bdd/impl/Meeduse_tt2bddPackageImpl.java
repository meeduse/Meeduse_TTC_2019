/**
 */
package meeduse_tt2bdd.impl;

import meeduse_tt2bdd.Assignment;
import meeduse_tt2bdd.BdP;
import meeduse_tt2bdd.BddInput;
import meeduse_tt2bdd.BddOutput;
import meeduse_tt2bdd.Cell;
import meeduse_tt2bdd.Element;
import meeduse_tt2bdd.InputPort;
import meeduse_tt2bdd.Leaf;
import meeduse_tt2bdd.Meeduse_tt2bddFactory;
import meeduse_tt2bdd.Meeduse_tt2bddPackage;
import meeduse_tt2bdd.OutputPort;
import meeduse_tt2bdd.Port;
import meeduse_tt2bdd.Row;
import meeduse_tt2bdd.Subtree;
import meeduse_tt2bdd.Tree;
import meeduse_tt2bdd.TruthTable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Meeduse_tt2bddPackageImpl extends EPackageImpl implements Meeduse_tt2bddPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass truthTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bddOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bdPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bddInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Meeduse_tt2bddPackageImpl() {
		super(eNS_URI, Meeduse_tt2bddFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Meeduse_tt2bddPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Meeduse_tt2bddPackage init() {
		if (isInited) return (Meeduse_tt2bddPackage)EPackage.Registry.INSTANCE.getEPackage(Meeduse_tt2bddPackage.eNS_URI);

		// Obtain or create and register package
		Meeduse_tt2bddPackageImpl theMeeduse_tt2bddPackage = (Meeduse_tt2bddPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Meeduse_tt2bddPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Meeduse_tt2bddPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMeeduse_tt2bddPackage.createPackageContents();

		// Initialize created meta-data
		theMeeduse_tt2bddPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeeduse_tt2bddPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Meeduse_tt2bddPackage.eNS_URI, theMeeduse_tt2bddPackage);
		return theMeeduse_tt2bddPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Value() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCell_Owner() {
		return (EReference)cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCell_Port() {
		return (EReference)cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Done() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Selected() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Owner() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Cells() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Owner() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Cells() {
		return (EReference)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTruthTable() {
		return truthTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTruthTable_Ports() {
		return (EReference)truthTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTruthTable_Rows() {
		return (EReference)truthTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtree() {
		return subtreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtree_Port() {
		return (EReference)subtreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtree_TreeForZero() {
		return (EReference)subtreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtree_TreeForOne() {
		return (EReference)subtreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Value() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Port() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Owner() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBddOutput() {
		return bddOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBddOutput_Assignments() {
		return (EReference)bddOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeaf() {
		return leafEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeaf_Assignments() {
		return (EReference)leafEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTree() {
		return treeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTree_OwnerBDD() {
		return (EReference)treeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTree_OwnerSubtreeForZero() {
		return (EReference)treeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTree_OwnerSubtreeForOne() {
		return (EReference)treeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTree_Name() {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBDD() {
		return bddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBDD_Ports() {
		return (EReference)bddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBDD_Tree() {
		return (EReference)bddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBdP() {
		return bdPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBdP_Owner() {
		return (EReference)bdPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBddInput() {
		return bddInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBddInput_Subtrees() {
		return (EReference)bddInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeduse_tt2bddFactory getMeeduse_tt2bddFactory() {
		return (Meeduse_tt2bddFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		inputPortEClass = createEClass(INPUT_PORT);

		cellEClass = createEClass(CELL);
		createEAttribute(cellEClass, CELL__VALUE);
		createEReference(cellEClass, CELL__OWNER);
		createEReference(cellEClass, CELL__PORT);
		createEAttribute(cellEClass, CELL__DONE);
		createEAttribute(cellEClass, CELL__SELECTED);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__OWNER);
		createEReference(portEClass, PORT__CELLS);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__OWNER);
		createEReference(rowEClass, ROW__CELLS);

		outputPortEClass = createEClass(OUTPUT_PORT);

		truthTableEClass = createEClass(TRUTH_TABLE);
		createEReference(truthTableEClass, TRUTH_TABLE__PORTS);
		createEReference(truthTableEClass, TRUTH_TABLE__ROWS);

		subtreeEClass = createEClass(SUBTREE);
		createEReference(subtreeEClass, SUBTREE__PORT);
		createEReference(subtreeEClass, SUBTREE__TREE_FOR_ZERO);
		createEReference(subtreeEClass, SUBTREE__TREE_FOR_ONE);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__VALUE);
		createEReference(assignmentEClass, ASSIGNMENT__PORT);
		createEReference(assignmentEClass, ASSIGNMENT__OWNER);

		bddOutputEClass = createEClass(BDD_OUTPUT);
		createEReference(bddOutputEClass, BDD_OUTPUT__ASSIGNMENTS);

		leafEClass = createEClass(LEAF);
		createEReference(leafEClass, LEAF__ASSIGNMENTS);

		treeEClass = createEClass(TREE);
		createEReference(treeEClass, TREE__OWNER_BDD);
		createEReference(treeEClass, TREE__OWNER_SUBTREE_FOR_ZERO);
		createEReference(treeEClass, TREE__OWNER_SUBTREE_FOR_ONE);
		createEAttribute(treeEClass, TREE__NAME);

		bddEClass = createEClass(BDD);
		createEReference(bddEClass, BDD__PORTS);
		createEReference(bddEClass, BDD__TREE);

		bdPEClass = createEClass(BD_P);
		createEReference(bdPEClass, BD_P__OWNER);

		bddInputEClass = createEClass(BDD_INPUT);
		createEReference(bddInputEClass, BDD_INPUT__SUBTREES);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputPortEClass.getESuperTypes().add(this.getPort());
		cellEClass.getESuperTypes().add(this.getElement());
		portEClass.getESuperTypes().add(this.getElement());
		rowEClass.getESuperTypes().add(this.getElement());
		outputPortEClass.getESuperTypes().add(this.getPort());
		truthTableEClass.getESuperTypes().add(this.getElement());
		subtreeEClass.getESuperTypes().add(this.getTree());
		assignmentEClass.getESuperTypes().add(this.getElement());
		bddOutputEClass.getESuperTypes().add(this.getBdP());
		leafEClass.getESuperTypes().add(this.getTree());
		bddEClass.getESuperTypes().add(this.getElement());
		bdPEClass.getESuperTypes().add(this.getElement());
		bddInputEClass.getESuperTypes().add(this.getBdP());

		// Initialize classes, features, and operations; add parameters
		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCell_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCell_Owner(), this.getRow(), this.getRow_Cells(), "owner", null, 1, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCell_Port(), this.getPort(), this.getPort_Cells(), "port", null, 1, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCell_Done(), ecorePackage.getEBoolean(), "done", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Owner(), this.getTruthTable(), this.getTruthTable_Ports(), "owner", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Cells(), this.getCell(), this.getCell_Port(), "cells", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Owner(), this.getTruthTable(), this.getTruthTable_Rows(), "owner", null, 1, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRow_Cells(), this.getCell(), this.getCell_Owner(), "cells", null, 1, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(truthTableEClass, TruthTable.class, "TruthTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTruthTable_Ports(), this.getPort(), this.getPort_Owner(), "ports", null, 1, -1, TruthTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTruthTable_Rows(), this.getRow(), this.getRow_Owner(), "rows", null, 2, -1, TruthTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subtreeEClass, Subtree.class, "Subtree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubtree_Port(), this.getBddInput(), this.getBddInput_Subtrees(), "port", null, 1, 1, Subtree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubtree_TreeForZero(), this.getTree(), this.getTree_OwnerSubtreeForZero(), "treeForZero", null, 1, 1, Subtree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubtree_TreeForOne(), this.getTree(), this.getTree_OwnerSubtreeForOne(), "treeForOne", null, 1, 1, Subtree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssignment_Port(), this.getBddOutput(), this.getBddOutput_Assignments(), "port", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssignment_Owner(), this.getLeaf(), this.getLeaf_Assignments(), "owner", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bddOutputEClass, BddOutput.class, "BddOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBddOutput_Assignments(), this.getAssignment(), this.getAssignment_Port(), "assignments", null, 0, -1, BddOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(leafEClass, Leaf.class, "Leaf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeaf_Assignments(), this.getAssignment(), this.getAssignment_Owner(), "assignments", null, 1, -1, Leaf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(treeEClass, Tree.class, "Tree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTree_OwnerBDD(), this.getBDD(), this.getBDD_Tree(), "ownerBDD", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTree_OwnerSubtreeForZero(), this.getSubtree(), this.getSubtree_TreeForZero(), "ownerSubtreeForZero", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTree_OwnerSubtreeForOne(), this.getSubtree(), this.getSubtree_TreeForOne(), "ownerSubtreeForOne", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTree_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bddEClass, meeduse_tt2bdd.BDD.class, "BDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBDD_Ports(), this.getBdP(), this.getBdP_Owner(), "ports", null, 0, -1, meeduse_tt2bdd.BDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBDD_Tree(), this.getTree(), this.getTree_OwnerBDD(), "tree", null, 0, 1, meeduse_tt2bdd.BDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bdPEClass, BdP.class, "BdP", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBdP_Owner(), this.getBDD(), this.getBDD_Ports(), "owner", null, 0, 1, BdP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bddInputEClass, BddInput.class, "BddInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBddInput_Subtrees(), this.getSubtree(), this.getSubtree_Port(), "subtrees", null, 0, -1, BddInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (rowEClass, 
		   source, 
		   new String[] {
			 "archetype", "MomentInterval"
		   });
	}

} //Meeduse_tt2bddPackageImpl
