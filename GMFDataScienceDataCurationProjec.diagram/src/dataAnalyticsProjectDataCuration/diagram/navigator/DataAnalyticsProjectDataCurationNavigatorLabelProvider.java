package dataAnalyticsProjectDataCuration.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class DataAnalyticsProjectDataCurationNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem
				&& !isOwnView(
						((dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) element)
								.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorGroup) {
			dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorGroup group = (dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorGroup) element;
			return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) {
			dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem navigatorItem = (dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
				.getVisualID(view)) {
		case dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://DataAnalyticsProjectDataCuration.ecore?Attribute", //$NON-NLS-1$
					dataAnalyticsProjectDataCuration.diagram.providers.DataAnalyticsProjectDataCurationElementTypes.Attribute_1000);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& dataAnalyticsProjectDataCuration.diagram.providers.DataAnalyticsProjectDataCurationElementTypes
						.isKnownElementType(elementType)) {
			image = dataAnalyticsProjectDataCuration.diagram.providers.DataAnalyticsProjectDataCurationElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorGroup) {
			dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorGroup group = (dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) {
			dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem navigatorItem = (dataAnalyticsProjectDataCuration.diagram.navigator.DataAnalyticsProjectDataCurationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
				.getVisualID(view)) {
		case dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getAttribute_1000Text(View view) {
		dataAnalyticsProjectDataCuration.Attribute domainModelElement = (dataAnalyticsProjectDataCuration.Attribute) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return dataAnalyticsProjectDataCuration.diagram.edit.parts.AttributeEditPart.MODEL_ID
				.equals(dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationVisualIDRegistry
						.getModelID(view));
	}

}
