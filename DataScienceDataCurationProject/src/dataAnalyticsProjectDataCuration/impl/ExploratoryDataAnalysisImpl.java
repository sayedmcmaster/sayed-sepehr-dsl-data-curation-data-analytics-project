/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.BiVariateAnalysis;
import dataAnalyticsProjectDataCuration.BiVariateVisualization;
import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis;
import dataAnalyticsProjectDataCuration.NormalizationStandardization;
import dataAnalyticsProjectDataCuration.PValueFSignificance;
import dataAnalyticsProjectDataCuration.RSquare;
import dataAnalyticsProjectDataCuration.UnitaryAnalysis;
import dataAnalyticsProjectDataCuration.UnivariateVisualization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exploratory Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl#getRSquare <em>RSquare</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl#getPValueFSignificance <em>PValue FSignificance</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl#getUnitaryAnalysis <em>Unitary Analysis</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl#getBiVariateAnalysis <em>Bi Variate Analysis</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl#getUnivariateVisualization <em>Univariate Visualization</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl#getBiVariateVisualization <em>Bi Variate Visualization</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl#getNormalizationStandardization <em>Normalization Standardization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExploratoryDataAnalysisImpl extends MinimalEObjectImpl.Container implements ExploratoryDataAnalysis {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRSquare() <em>RSquare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSquare()
	 * @generated
	 * @ordered
	 */
	protected RSquare rSquare;

	/**
	 * The cached value of the '{@link #getPValueFSignificance() <em>PValue FSignificance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPValueFSignificance()
	 * @generated
	 * @ordered
	 */
	protected PValueFSignificance pValueFSignificance;

	/**
	 * The cached value of the '{@link #getUnitaryAnalysis() <em>Unitary Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitaryAnalysis()
	 * @generated
	 * @ordered
	 */
	protected UnitaryAnalysis unitaryAnalysis;

	/**
	 * The cached value of the '{@link #getBiVariateAnalysis() <em>Bi Variate Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiVariateAnalysis()
	 * @generated
	 * @ordered
	 */
	protected BiVariateAnalysis biVariateAnalysis;

	/**
	 * The cached value of the '{@link #getUnivariateVisualization() <em>Univariate Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnivariateVisualization()
	 * @generated
	 * @ordered
	 */
	protected UnivariateVisualization univariateVisualization;

	/**
	 * The cached value of the '{@link #getBiVariateVisualization() <em>Bi Variate Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiVariateVisualization()
	 * @generated
	 * @ordered
	 */
	protected BiVariateVisualization biVariateVisualization;

	/**
	 * The cached value of the '{@link #getNormalizationStandardization() <em>Normalization Standardization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizationStandardization()
	 * @generated
	 * @ordered
	 */
	protected NormalizationStandardization normalizationStandardization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExploratoryDataAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.EXPLORATORY_DATA_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSquare getRSquare() {
		return rSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSquare(RSquare newRSquare, NotificationChain msgs) {
		RSquare oldRSquare = rSquare;
		rSquare = newRSquare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE, oldRSquare, newRSquare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSquare(RSquare newRSquare) {
		if (newRSquare != rSquare) {
			NotificationChain msgs = null;
			if (rSquare != null)
				msgs = ((InternalEObject)rSquare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE, null, msgs);
			if (newRSquare != null)
				msgs = ((InternalEObject)newRSquare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE, null, msgs);
			msgs = basicSetRSquare(newRSquare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE, newRSquare, newRSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PValueFSignificance getPValueFSignificance() {
		return pValueFSignificance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPValueFSignificance(PValueFSignificance newPValueFSignificance, NotificationChain msgs) {
		PValueFSignificance oldPValueFSignificance = pValueFSignificance;
		pValueFSignificance = newPValueFSignificance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE, oldPValueFSignificance, newPValueFSignificance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPValueFSignificance(PValueFSignificance newPValueFSignificance) {
		if (newPValueFSignificance != pValueFSignificance) {
			NotificationChain msgs = null;
			if (pValueFSignificance != null)
				msgs = ((InternalEObject)pValueFSignificance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE, null, msgs);
			if (newPValueFSignificance != null)
				msgs = ((InternalEObject)newPValueFSignificance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE, null, msgs);
			msgs = basicSetPValueFSignificance(newPValueFSignificance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE, newPValueFSignificance, newPValueFSignificance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitaryAnalysis getUnitaryAnalysis() {
		return unitaryAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitaryAnalysis(UnitaryAnalysis newUnitaryAnalysis, NotificationChain msgs) {
		UnitaryAnalysis oldUnitaryAnalysis = unitaryAnalysis;
		unitaryAnalysis = newUnitaryAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS, oldUnitaryAnalysis, newUnitaryAnalysis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitaryAnalysis(UnitaryAnalysis newUnitaryAnalysis) {
		if (newUnitaryAnalysis != unitaryAnalysis) {
			NotificationChain msgs = null;
			if (unitaryAnalysis != null)
				msgs = ((InternalEObject)unitaryAnalysis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS, null, msgs);
			if (newUnitaryAnalysis != null)
				msgs = ((InternalEObject)newUnitaryAnalysis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS, null, msgs);
			msgs = basicSetUnitaryAnalysis(newUnitaryAnalysis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS, newUnitaryAnalysis, newUnitaryAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiVariateAnalysis getBiVariateAnalysis() {
		return biVariateAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiVariateAnalysis(BiVariateAnalysis newBiVariateAnalysis, NotificationChain msgs) {
		BiVariateAnalysis oldBiVariateAnalysis = biVariateAnalysis;
		biVariateAnalysis = newBiVariateAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS, oldBiVariateAnalysis, newBiVariateAnalysis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiVariateAnalysis(BiVariateAnalysis newBiVariateAnalysis) {
		if (newBiVariateAnalysis != biVariateAnalysis) {
			NotificationChain msgs = null;
			if (biVariateAnalysis != null)
				msgs = ((InternalEObject)biVariateAnalysis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS, null, msgs);
			if (newBiVariateAnalysis != null)
				msgs = ((InternalEObject)newBiVariateAnalysis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS, null, msgs);
			msgs = basicSetBiVariateAnalysis(newBiVariateAnalysis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS, newBiVariateAnalysis, newBiVariateAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnivariateVisualization getUnivariateVisualization() {
		return univariateVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivariateVisualization(UnivariateVisualization newUnivariateVisualization, NotificationChain msgs) {
		UnivariateVisualization oldUnivariateVisualization = univariateVisualization;
		univariateVisualization = newUnivariateVisualization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION, oldUnivariateVisualization, newUnivariateVisualization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnivariateVisualization(UnivariateVisualization newUnivariateVisualization) {
		if (newUnivariateVisualization != univariateVisualization) {
			NotificationChain msgs = null;
			if (univariateVisualization != null)
				msgs = ((InternalEObject)univariateVisualization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION, null, msgs);
			if (newUnivariateVisualization != null)
				msgs = ((InternalEObject)newUnivariateVisualization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION, null, msgs);
			msgs = basicSetUnivariateVisualization(newUnivariateVisualization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION, newUnivariateVisualization, newUnivariateVisualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiVariateVisualization getBiVariateVisualization() {
		return biVariateVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiVariateVisualization(BiVariateVisualization newBiVariateVisualization, NotificationChain msgs) {
		BiVariateVisualization oldBiVariateVisualization = biVariateVisualization;
		biVariateVisualization = newBiVariateVisualization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION, oldBiVariateVisualization, newBiVariateVisualization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiVariateVisualization(BiVariateVisualization newBiVariateVisualization) {
		if (newBiVariateVisualization != biVariateVisualization) {
			NotificationChain msgs = null;
			if (biVariateVisualization != null)
				msgs = ((InternalEObject)biVariateVisualization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION, null, msgs);
			if (newBiVariateVisualization != null)
				msgs = ((InternalEObject)newBiVariateVisualization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION, null, msgs);
			msgs = basicSetBiVariateVisualization(newBiVariateVisualization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION, newBiVariateVisualization, newBiVariateVisualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizationStandardization getNormalizationStandardization() {
		return normalizationStandardization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalizationStandardization(NormalizationStandardization newNormalizationStandardization, NotificationChain msgs) {
		NormalizationStandardization oldNormalizationStandardization = normalizationStandardization;
		normalizationStandardization = newNormalizationStandardization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION, oldNormalizationStandardization, newNormalizationStandardization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizationStandardization(NormalizationStandardization newNormalizationStandardization) {
		if (newNormalizationStandardization != normalizationStandardization) {
			NotificationChain msgs = null;
			if (normalizationStandardization != null)
				msgs = ((InternalEObject)normalizationStandardization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION, null, msgs);
			if (newNormalizationStandardization != null)
				msgs = ((InternalEObject)newNormalizationStandardization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION, null, msgs);
			msgs = basicSetNormalizationStandardization(newNormalizationStandardization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION, newNormalizationStandardization, newNormalizationStandardization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				return basicSetRSquare(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				return basicSetPValueFSignificance(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				return basicSetUnitaryAnalysis(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				return basicSetBiVariateAnalysis(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				return basicSetUnivariateVisualization(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				return basicSetBiVariateVisualization(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				return basicSetNormalizationStandardization(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				return getRSquare();
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				return getPValueFSignificance();
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				return getUnitaryAnalysis();
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				return getBiVariateAnalysis();
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				return getUnivariateVisualization();
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				return getBiVariateVisualization();
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				return getNormalizationStandardization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				setRSquare((RSquare)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				setPValueFSignificance((PValueFSignificance)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				setUnitaryAnalysis((UnitaryAnalysis)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				setBiVariateAnalysis((BiVariateAnalysis)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				setUnivariateVisualization((UnivariateVisualization)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				setBiVariateVisualization((BiVariateVisualization)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				setNormalizationStandardization((NormalizationStandardization)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				setRSquare((RSquare)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				setPValueFSignificance((PValueFSignificance)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				setUnitaryAnalysis((UnitaryAnalysis)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				setBiVariateAnalysis((BiVariateAnalysis)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				setUnivariateVisualization((UnivariateVisualization)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				setBiVariateVisualization((BiVariateVisualization)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				setNormalizationStandardization((NormalizationStandardization)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				return rSquare != null;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				return pValueFSignificance != null;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				return unitaryAnalysis != null;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				return biVariateAnalysis != null;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				return univariateVisualization != null;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				return biVariateVisualization != null;
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				return normalizationStandardization != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ExploratoryDataAnalysisImpl
