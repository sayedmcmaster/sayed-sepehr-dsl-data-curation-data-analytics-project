package dataAnalyticsProjectDataCuration.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class DataAnalyticsProjectDataCurationNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 1002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) {
			dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem item = (dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) element;
			return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
