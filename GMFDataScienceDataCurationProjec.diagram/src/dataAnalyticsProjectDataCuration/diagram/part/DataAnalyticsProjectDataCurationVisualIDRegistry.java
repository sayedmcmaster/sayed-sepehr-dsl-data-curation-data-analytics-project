package dataAnalyticsProjectDataCuration.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DataAnalyticsProjectDataCurationVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "GMFDataScienceDataCurationProjec.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.MODEL_ID.equals(view.getType())) {
				return dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin
						.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage.eINSTANCE.getAttribute()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((dataAnalyticsProjectDataCuration.Attribute) domainElement)) {
			return dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
				.getModelID(containerView);
		if (!dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
				.getModelID(containerView);
		if (!dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(dataAnalyticsProjectDataCuration.Attribute element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return false;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/

		public int getVisualID(View view) {
			return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.getVisualID(view);
		}

		/**
		* @generated
		*/

		public String getModelID(View view) {
			return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.getModelID(view);
		}

		/**
		* @generated
		*/

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/

		public boolean isCompartmentVisualID(int visualID) {
			return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/

		public boolean isSemanticLeafVisualID(int visualID) {
			return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
