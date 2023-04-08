package dataAnalyticsProjectDataCuration.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DataAnalyticsProjectDataCurationNavigatorItem extends
		dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationAbstractNavigatorItem {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private View myView;

	/**
	* @generated
	*/
	private boolean myLeaf = false;

	/**
	* @generated
	*/
	public DataAnalyticsProjectDataCurationNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	* @generated
	*/
	public View getView() {
		return myView;
	}

	/**
	* @generated
	*/
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) {
			return EcoreUtil.getURI(getView()).equals(EcoreUtil.getURI(
					((dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) obj)
							.getView()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
