/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see meeduse_tt2bdd.Meeduse_tt2bddFactory
 * @model kind="package"
 * @generated
 */
public interface Meeduse_tt2bddPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "meeduse_tt2bdd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/meeduse_tt2bdd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "meeduse_tt2bdd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Meeduse_tt2bddPackage eINSTANCE = meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl.init();

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.ElementImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.PortImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OWNER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CELLS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.InputPortImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__OWNER = PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CELLS = PORT__CELLS;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.CellImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__OWNER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__PORT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DONE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__SELECTED = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.RowImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__OWNER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.OutputPortImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__OWNER = PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CELLS = PORT__CELLS;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.TruthTableImpl <em>Truth Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.TruthTableImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getTruthTable()
	 * @generated
	 */
	int TRUTH_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__PORTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__ROWS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Truth Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Truth Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.TreeImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 10;

	/**
	 * The feature id for the '<em><b>Owner BDD</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__OWNER_BDD = 0;

	/**
	 * The feature id for the '<em><b>Owner Subtree For Zero</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__OWNER_SUBTREE_FOR_ZERO = 1;

	/**
	 * The feature id for the '<em><b>Owner Subtree For One</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__OWNER_SUBTREE_FOR_ONE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.SubtreeImpl <em>Subtree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.SubtreeImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getSubtree()
	 * @generated
	 */
	int SUBTREE = 6;

	/**
	 * The feature id for the '<em><b>Owner BDD</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__OWNER_BDD = TREE__OWNER_BDD;

	/**
	 * The feature id for the '<em><b>Owner Subtree For Zero</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__OWNER_SUBTREE_FOR_ZERO = TREE__OWNER_SUBTREE_FOR_ZERO;

	/**
	 * The feature id for the '<em><b>Owner Subtree For One</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__OWNER_SUBTREE_FOR_ONE = TREE__OWNER_SUBTREE_FOR_ONE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__NAME = TREE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__PORT = TREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tree For Zero</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__TREE_FOR_ZERO = TREE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tree For One</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__TREE_FOR_ONE = TREE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subtree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_FEATURE_COUNT = TREE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Subtree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_OPERATION_COUNT = TREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.AssignmentImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__PORT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OWNER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.BdPImpl <em>Bd P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.BdPImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getBdP()
	 * @generated
	 */
	int BD_P = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD_P__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD_P__OWNER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bd P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD_P_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bd P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD_P_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.BddOutputImpl <em>Bdd Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.BddOutputImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getBddOutput()
	 * @generated
	 */
	int BDD_OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_OUTPUT__NAME = BD_P__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_OUTPUT__OWNER = BD_P__OWNER;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_OUTPUT__ASSIGNMENTS = BD_P_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bdd Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_OUTPUT_FEATURE_COUNT = BD_P_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bdd Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_OUTPUT_OPERATION_COUNT = BD_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.LeafImpl <em>Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.LeafImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getLeaf()
	 * @generated
	 */
	int LEAF = 9;

	/**
	 * The feature id for the '<em><b>Owner BDD</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__OWNER_BDD = TREE__OWNER_BDD;

	/**
	 * The feature id for the '<em><b>Owner Subtree For Zero</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__OWNER_SUBTREE_FOR_ZERO = TREE__OWNER_SUBTREE_FOR_ZERO;

	/**
	 * The feature id for the '<em><b>Owner Subtree For One</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__OWNER_SUBTREE_FOR_ONE = TREE__OWNER_SUBTREE_FOR_ONE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__NAME = TREE__NAME;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__ASSIGNMENTS = TREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FEATURE_COUNT = TREE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OPERATION_COUNT = TREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.BDDImpl <em>BDD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.BDDImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getBDD()
	 * @generated
	 */
	int BDD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD__PORTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD__TREE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link meeduse_tt2bdd.impl.BddInputImpl <em>Bdd Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see meeduse_tt2bdd.impl.BddInputImpl
	 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getBddInput()
	 * @generated
	 */
	int BDD_INPUT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_INPUT__NAME = BD_P__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_INPUT__OWNER = BD_P__OWNER;

	/**
	 * The feature id for the '<em><b>Subtrees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_INPUT__SUBTREES = BD_P_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bdd Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_INPUT_FEATURE_COUNT = BD_P_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bdd Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDD_INPUT_OPERATION_COUNT = BD_P_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see meeduse_tt2bdd.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see meeduse_tt2bdd.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link meeduse_tt2bdd.Cell#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see meeduse_tt2bdd.Cell#isValue()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Value();

	/**
	 * Returns the meta object for the container reference '{@link meeduse_tt2bdd.Cell#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see meeduse_tt2bdd.Cell#getOwner()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Owner();

	/**
	 * Returns the meta object for the reference '{@link meeduse_tt2bdd.Cell#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see meeduse_tt2bdd.Cell#getPort()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Port();

	/**
	 * Returns the meta object for the attribute '{@link meeduse_tt2bdd.Cell#isDone <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see meeduse_tt2bdd.Cell#isDone()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Done();

	/**
	 * Returns the meta object for the attribute '{@link meeduse_tt2bdd.Cell#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see meeduse_tt2bdd.Cell#isSelected()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Selected();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see meeduse_tt2bdd.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link meeduse_tt2bdd.Port#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see meeduse_tt2bdd.Port#getOwner()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Owner();

	/**
	 * Returns the meta object for the reference list '{@link meeduse_tt2bdd.Port#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see meeduse_tt2bdd.Port#getCells()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Cells();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see meeduse_tt2bdd.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the container reference '{@link meeduse_tt2bdd.Row#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see meeduse_tt2bdd.Row#getOwner()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link meeduse_tt2bdd.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see meeduse_tt2bdd.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see meeduse_tt2bdd.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.TruthTable <em>Truth Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truth Table</em>'.
	 * @see meeduse_tt2bdd.TruthTable
	 * @generated
	 */
	EClass getTruthTable();

	/**
	 * Returns the meta object for the containment reference list '{@link meeduse_tt2bdd.TruthTable#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see meeduse_tt2bdd.TruthTable#getPorts()
	 * @see #getTruthTable()
	 * @generated
	 */
	EReference getTruthTable_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link meeduse_tt2bdd.TruthTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see meeduse_tt2bdd.TruthTable#getRows()
	 * @see #getTruthTable()
	 * @generated
	 */
	EReference getTruthTable_Rows();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.Subtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtree</em>'.
	 * @see meeduse_tt2bdd.Subtree
	 * @generated
	 */
	EClass getSubtree();

	/**
	 * Returns the meta object for the reference '{@link meeduse_tt2bdd.Subtree#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see meeduse_tt2bdd.Subtree#getPort()
	 * @see #getSubtree()
	 * @generated
	 */
	EReference getSubtree_Port();

	/**
	 * Returns the meta object for the containment reference '{@link meeduse_tt2bdd.Subtree#getTreeForZero <em>Tree For Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tree For Zero</em>'.
	 * @see meeduse_tt2bdd.Subtree#getTreeForZero()
	 * @see #getSubtree()
	 * @generated
	 */
	EReference getSubtree_TreeForZero();

	/**
	 * Returns the meta object for the containment reference '{@link meeduse_tt2bdd.Subtree#getTreeForOne <em>Tree For One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tree For One</em>'.
	 * @see meeduse_tt2bdd.Subtree#getTreeForOne()
	 * @see #getSubtree()
	 * @generated
	 */
	EReference getSubtree_TreeForOne();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see meeduse_tt2bdd.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link meeduse_tt2bdd.Assignment#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see meeduse_tt2bdd.Assignment#isValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Value();

	/**
	 * Returns the meta object for the reference '{@link meeduse_tt2bdd.Assignment#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see meeduse_tt2bdd.Assignment#getPort()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Port();

	/**
	 * Returns the meta object for the container reference '{@link meeduse_tt2bdd.Assignment#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see meeduse_tt2bdd.Assignment#getOwner()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Owner();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.BddOutput <em>Bdd Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bdd Output</em>'.
	 * @see meeduse_tt2bdd.BddOutput
	 * @generated
	 */
	EClass getBddOutput();

	/**
	 * Returns the meta object for the reference list '{@link meeduse_tt2bdd.BddOutput#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see meeduse_tt2bdd.BddOutput#getAssignments()
	 * @see #getBddOutput()
	 * @generated
	 */
	EReference getBddOutput_Assignments();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf</em>'.
	 * @see meeduse_tt2bdd.Leaf
	 * @generated
	 */
	EClass getLeaf();

	/**
	 * Returns the meta object for the containment reference list '{@link meeduse_tt2bdd.Leaf#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see meeduse_tt2bdd.Leaf#getAssignments()
	 * @see #getLeaf()
	 * @generated
	 */
	EReference getLeaf_Assignments();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see meeduse_tt2bdd.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the container reference '{@link meeduse_tt2bdd.Tree#getOwnerBDD <em>Owner BDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner BDD</em>'.
	 * @see meeduse_tt2bdd.Tree#getOwnerBDD()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_OwnerBDD();

	/**
	 * Returns the meta object for the container reference '{@link meeduse_tt2bdd.Tree#getOwnerSubtreeForZero <em>Owner Subtree For Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Subtree For Zero</em>'.
	 * @see meeduse_tt2bdd.Tree#getOwnerSubtreeForZero()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_OwnerSubtreeForZero();

	/**
	 * Returns the meta object for the container reference '{@link meeduse_tt2bdd.Tree#getOwnerSubtreeForOne <em>Owner Subtree For One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Subtree For One</em>'.
	 * @see meeduse_tt2bdd.Tree#getOwnerSubtreeForOne()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_OwnerSubtreeForOne();

	/**
	 * Returns the meta object for the attribute '{@link meeduse_tt2bdd.Tree#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see meeduse_tt2bdd.Tree#getName()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_Name();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.BDD <em>BDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BDD</em>'.
	 * @see meeduse_tt2bdd.BDD
	 * @generated
	 */
	EClass getBDD();

	/**
	 * Returns the meta object for the containment reference list '{@link meeduse_tt2bdd.BDD#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see meeduse_tt2bdd.BDD#getPorts()
	 * @see #getBDD()
	 * @generated
	 */
	EReference getBDD_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link meeduse_tt2bdd.BDD#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tree</em>'.
	 * @see meeduse_tt2bdd.BDD#getTree()
	 * @see #getBDD()
	 * @generated
	 */
	EReference getBDD_Tree();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.BdP <em>Bd P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bd P</em>'.
	 * @see meeduse_tt2bdd.BdP
	 * @generated
	 */
	EClass getBdP();

	/**
	 * Returns the meta object for the container reference '{@link meeduse_tt2bdd.BdP#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see meeduse_tt2bdd.BdP#getOwner()
	 * @see #getBdP()
	 * @generated
	 */
	EReference getBdP_Owner();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.BddInput <em>Bdd Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bdd Input</em>'.
	 * @see meeduse_tt2bdd.BddInput
	 * @generated
	 */
	EClass getBddInput();

	/**
	 * Returns the meta object for the reference list '{@link meeduse_tt2bdd.BddInput#getSubtrees <em>Subtrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtrees</em>'.
	 * @see meeduse_tt2bdd.BddInput#getSubtrees()
	 * @see #getBddInput()
	 * @generated
	 */
	EReference getBddInput_Subtrees();

	/**
	 * Returns the meta object for class '{@link meeduse_tt2bdd.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see meeduse_tt2bdd.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link meeduse_tt2bdd.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see meeduse_tt2bdd.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Meeduse_tt2bddFactory getMeeduse_tt2bddFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.InputPortImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.CellImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__VALUE = eINSTANCE.getCell_Value();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__OWNER = eINSTANCE.getCell_Owner();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__PORT = eINSTANCE.getCell_Port();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__DONE = eINSTANCE.getCell_Done();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__SELECTED = eINSTANCE.getCell_Selected();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.PortImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__OWNER = eINSTANCE.getPort_Owner();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CELLS = eINSTANCE.getPort_Cells();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.RowImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__OWNER = eINSTANCE.getRow_Owner();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.OutputPortImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.TruthTableImpl <em>Truth Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.TruthTableImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getTruthTable()
		 * @generated
		 */
		EClass TRUTH_TABLE = eINSTANCE.getTruthTable();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUTH_TABLE__PORTS = eINSTANCE.getTruthTable_Ports();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUTH_TABLE__ROWS = eINSTANCE.getTruthTable_Rows();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.SubtreeImpl <em>Subtree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.SubtreeImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getSubtree()
		 * @generated
		 */
		EClass SUBTREE = eINSTANCE.getSubtree();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE__PORT = eINSTANCE.getSubtree_Port();

		/**
		 * The meta object literal for the '<em><b>Tree For Zero</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE__TREE_FOR_ZERO = eINSTANCE.getSubtree_TreeForZero();

		/**
		 * The meta object literal for the '<em><b>Tree For One</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE__TREE_FOR_ONE = eINSTANCE.getSubtree_TreeForOne();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.AssignmentImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__PORT = eINSTANCE.getAssignment_Port();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__OWNER = eINSTANCE.getAssignment_Owner();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.BddOutputImpl <em>Bdd Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.BddOutputImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getBddOutput()
		 * @generated
		 */
		EClass BDD_OUTPUT = eINSTANCE.getBddOutput();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BDD_OUTPUT__ASSIGNMENTS = eINSTANCE.getBddOutput_Assignments();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.LeafImpl <em>Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.LeafImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getLeaf()
		 * @generated
		 */
		EClass LEAF = eINSTANCE.getLeaf();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF__ASSIGNMENTS = eINSTANCE.getLeaf_Assignments();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.TreeImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '<em><b>Owner BDD</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__OWNER_BDD = eINSTANCE.getTree_OwnerBDD();

		/**
		 * The meta object literal for the '<em><b>Owner Subtree For Zero</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__OWNER_SUBTREE_FOR_ZERO = eINSTANCE.getTree_OwnerSubtreeForZero();

		/**
		 * The meta object literal for the '<em><b>Owner Subtree For One</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__OWNER_SUBTREE_FOR_ONE = eINSTANCE.getTree_OwnerSubtreeForOne();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__NAME = eINSTANCE.getTree_Name();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.BDDImpl <em>BDD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.BDDImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getBDD()
		 * @generated
		 */
		EClass BDD = eINSTANCE.getBDD();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BDD__PORTS = eINSTANCE.getBDD_Ports();

		/**
		 * The meta object literal for the '<em><b>Tree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BDD__TREE = eINSTANCE.getBDD_Tree();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.BdPImpl <em>Bd P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.BdPImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getBdP()
		 * @generated
		 */
		EClass BD_P = eINSTANCE.getBdP();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BD_P__OWNER = eINSTANCE.getBdP_Owner();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.BddInputImpl <em>Bdd Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.BddInputImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getBddInput()
		 * @generated
		 */
		EClass BDD_INPUT = eINSTANCE.getBddInput();

		/**
		 * The meta object literal for the '<em><b>Subtrees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BDD_INPUT__SUBTREES = eINSTANCE.getBddInput_Subtrees();

		/**
		 * The meta object literal for the '{@link meeduse_tt2bdd.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see meeduse_tt2bdd.impl.ElementImpl
		 * @see meeduse_tt2bdd.impl.Meeduse_tt2bddPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

	}

} //Meeduse_tt2bddPackage
