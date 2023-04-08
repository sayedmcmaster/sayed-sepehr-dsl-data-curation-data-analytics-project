package dataAnalyticsProjectDataCuration.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		dataAnalyticsProjectDataCuration.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		dataAnalyticsProjectDataCuration.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		dataAnalyticsProjectDataCuration.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		dataAnalyticsProjectDataCuration.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		dataAnalyticsProjectDataCuration.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return dataAnalyticsProjectDataCuration.diagram.part.DataAnalyticsProjectDataCurationDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
