package dataAnalyticsProjectDataCuration.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin
					.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
