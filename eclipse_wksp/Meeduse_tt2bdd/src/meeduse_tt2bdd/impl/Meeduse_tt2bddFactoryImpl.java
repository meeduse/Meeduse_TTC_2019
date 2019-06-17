/**
 */
package meeduse_tt2bdd.impl;

import meeduse_tt2bdd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Meeduse_tt2bddFactoryImpl extends EFactoryImpl implements Meeduse_tt2bddFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Meeduse_tt2bddFactory init() {
		try {
			Meeduse_tt2bddFactory theMeeduse_tt2bddFactory = (Meeduse_tt2bddFactory)EPackage.Registry.INSTANCE.getEFactory(Meeduse_tt2bddPackage.eNS_URI);
			if (theMeeduse_tt2bddFactory != null) {
				return theMeeduse_tt2bddFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Meeduse_tt2bddFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeduse_tt2bddFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Meeduse_tt2bddPackage.INPUT_PORT: return createInputPort();
			case Meeduse_tt2bddPackage.CELL: return createCell();
			case Meeduse_tt2bddPackage.ROW: return createRow();
			case Meeduse_tt2bddPackage.OUTPUT_PORT: return createOutputPort();
			case Meeduse_tt2bddPackage.TRUTH_TABLE: return createTruthTable();
			case Meeduse_tt2bddPackage.SUBTREE: return createSubtree();
			case Meeduse_tt2bddPackage.ASSIGNMENT: return createAssignment();
			case Meeduse_tt2bddPackage.BDD_OUTPUT: return createBddOutput();
			case Meeduse_tt2bddPackage.LEAF: return createLeaf();
			case Meeduse_tt2bddPackage.BDD: return createBDD();
			case Meeduse_tt2bddPackage.BDD_INPUT: return createBddInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruthTable createTruthTable() {
		TruthTableImpl truthTable = new TruthTableImpl();
		return truthTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtree createSubtree() {
		SubtreeImpl subtree = new SubtreeImpl();
		return subtree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BddOutput createBddOutput() {
		BddOutputImpl bddOutput = new BddOutputImpl();
		return bddOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leaf createLeaf() {
		LeafImpl leaf = new LeafImpl();
		return leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDD createBDD() {
		BDDImpl bdd = new BDDImpl();
		return bdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BddInput createBddInput() {
		BddInputImpl bddInput = new BddInputImpl();
		return bddInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeduse_tt2bddPackage getMeeduse_tt2bddPackage() {
		return (Meeduse_tt2bddPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Meeduse_tt2bddPackage getPackage() {
		return Meeduse_tt2bddPackage.eINSTANCE;
	}

} //Meeduse_tt2bddFactoryImpl
