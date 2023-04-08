package dataAnalyticsProjectDataCuration.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class DataAnalyticsProjectDataCurationDiagramUpdater {

	/**
	* @generated
	*/
	public static List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationNodeDescriptor> getSemanticChildren(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationLinkDescriptor> getContainedLinks(
			View view) {
		switch (dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
				.getVisualID(view)) {
		case dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_1000ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationLinkDescriptor> getIncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationLinkDescriptor> getOutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationLinkDescriptor> getAttribute_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/

		public List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationNodeDescriptor> getSemanticChildren(
				View view) {
			return DataAnalyticsProjectDataCurationDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/

		public List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationLinkDescriptor> getContainedLinks(
				View view) {
			return DataAnalyticsProjectDataCurationDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/

		public List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationLinkDescriptor> getIncomingLinks(
				View view) {
			return DataAnalyticsProjectDataCurationDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/

		public List<dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationLinkDescriptor> getOutgoingLinks(
				View view) {
			return DataAnalyticsProjectDataCurationDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
