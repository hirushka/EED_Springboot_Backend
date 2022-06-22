package com.waruni96.emergency_excercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "accident_reporter")
@EntityListeners(AuditingEntityListener.class)

public class AccidentReporter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "infomer_fullname")
	private String informerFullName;
	
	@Column(name = "informer_membership")
	private String informerMembership;
	
	@Column(name = "informer_address")
	private String informerAddress;
	
	@Column(name = "informer_phone")
	private String informerPhone;
	
	@Column(name = "informing_datetime")
	private String informingDateTime;
	
	@Column(name = "acc_location")
	private String accLocation;
	
	@Column(name = "acc_descrption")
	private String accDescription;
	
	@Column(name = "is_public_involved")
	private boolean isPublicInvolved;
	
	@Column(name = "is_urgernt")
	private boolean isUrgent;
	
	@Column(name = "assistance_des")
	private String assistanceDes;
	
	@Column(name = "radionuclides")
	private String radionuclides;
	
	@Column(name = "sealed_type")
	private String sealedType;
	
	@Column(name = "unsealed_types")
	private String unsealedTypes;
	
	@Column(name = "generators_volt")
	private String generatorsVolt;
	
	@Column(name = "generators_amp")
	private String generatorsAmp;
	
	@Column(name = "location_type")
	private String locationType;
	
	@Column(name = "equipment_type")
	private String equipmentType;
	
	@Column(name = "emergency_nature")
	private String emergenyNature;
	
	@Column(name = "src_discovered_status")
	private String srcDiscoveredStatus;
	
	@Column(name = "is_controlled")
	private boolean isControlled;
	
	@Column(name = "prevention_actions")
	private String preventionAction;
	
	@Column(name = "lasttime_safe")
	private String lastTimeSafe;
	
	@Column(name = "src_origin")
	private String srcOrigin;
	
	@Column(name = "src_owner")
	private String srcOwner;
	
	@Column(name = "radiological_hazards")
	private String radiologicalHazards;
	
	@Column(name = "conventional_hazards")
	private String conventionalHazards;
	
	@Column(name = "injured_person")
	private int injuredPerson;
	
	@Column(name = "deaths")
	private int deaths;
	
	@Column(name = "exposed_individuals")
	private int exposedIndividuals;
	
	@Column(name = "contaminated_individuals")
	private int contaminatedIndividuals;
	
	@Column(name = "monitory_challenges")
	private String monitoryChallenges;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInformerFullName() {
		return informerFullName;
	}

	public void setInformerFullName(String informerFullName) {
		this.informerFullName = informerFullName;
	}

	public String getInformerMembership() {
		return informerMembership;
	}

	public void setInformerMembership(String informerMembership) {
		this.informerMembership = informerMembership;
	}

	public String getInformerAddress() {
		return informerAddress;
	}

	public void setInformerAddress(String informerAddress) {
		this.informerAddress = informerAddress;
	}

	public String getInformerPhone() {
		return informerPhone;
	}

	public void setInformerPhone(String informerPhone) {
		this.informerPhone = informerPhone;
	}

	public String getInformingDateTime() {
		return informingDateTime;
	}

	public void setInformingDateTime(String informingDateTime) {
		this.informingDateTime = informingDateTime;
	}

	public String getAccLocation() {
		return accLocation;
	}

	public void setAccLocation(String accLocation) {
		this.accLocation = accLocation;
	}

	public String getAccDescription() {
		return accDescription;
	}

	public void setAccDescription(String accDescription) {
		this.accDescription = accDescription;
	}

	public boolean isPublicInvolved() {
		return isPublicInvolved;
	}

	public void setPublicInvolved(boolean isPublicInvolved) {
		this.isPublicInvolved = isPublicInvolved;
	}

	public boolean isUrgent() {
		return isUrgent;
	}

	public void setUrgent(boolean isUrgent) {
		this.isUrgent = isUrgent;
	}

	public String getAssistanceDes() {
		return assistanceDes;
	}

	public void setAssistanceDes(String assistanceDes) {
		this.assistanceDes = assistanceDes;
	}

	public String getRadionuclides() {
		return radionuclides;
	}

	public void setRadionuclides(String radionuclides) {
		this.radionuclides = radionuclides;
	}

	public String getSealedType() {
		return sealedType;
	}

	public void setSealedType(String sealedType) {
		this.sealedType = sealedType;
	}

	public String getUnsealedTypes() {
		return unsealedTypes;
	}

	public void setUnsealedTypes(String unsealedTypes) {
		this.unsealedTypes = unsealedTypes;
	}

	public String getGeneratorsVolt() {
		return generatorsVolt;
	}

	public void setGeneratorsVolt(String generatorsVolt) {
		this.generatorsVolt = generatorsVolt;
	}

	public String getGeneratorsAmp() {
		return generatorsAmp;
	}

	public void setGeneratorsAmp(String generatorsAmp) {
		this.generatorsAmp = generatorsAmp;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getEmergenyNature() {
		return emergenyNature;
	}

	public void setEmergenyNature(String emergenyNature) {
		this.emergenyNature = emergenyNature;
	}

	public String getSrcDiscoveredStatus() {
		return srcDiscoveredStatus;
	}

	public void setSrcDiscoveredStatus(String srcDiscoveredStatus) {
		this.srcDiscoveredStatus = srcDiscoveredStatus;
	}

	public boolean isControlled() {
		return isControlled;
	}

	public void setControlled(boolean isControlled) {
		this.isControlled = isControlled;
	}

	public String getPreventionAction() {
		return preventionAction;
	}

	public void setPreventionAction(String preventionAction) {
		this.preventionAction = preventionAction;
	}

	public String getLastTimeSafe() {
		return lastTimeSafe;
	}

	public void setLastTimeSafe(String lastTimeSafe) {
		this.lastTimeSafe = lastTimeSafe;
	}

	public String getSrcOrigin() {
		return srcOrigin;
	}

	public void setSrcOrigin(String srcOrigin) {
		this.srcOrigin = srcOrigin;
	}

	public String getSrcOwner() {
		return srcOwner;
	}

	public void setSrcOwner(String srcOwner) {
		this.srcOwner = srcOwner;
	}

	public String getRadiologicalHazards() {
		return radiologicalHazards;
	}

	public void setRadiologicalHazards(String radiologicalHazards) {
		this.radiologicalHazards = radiologicalHazards;
	}

	public String getConventionalHazards() {
		return conventionalHazards;
	}

	public void setConventionalHazards(String conventionalHazards) {
		this.conventionalHazards = conventionalHazards;
	}

	public int getInjuredPerson() {
		return injuredPerson;
	}

	public void setInjuredPerson(int injuredPerson) {
		this.injuredPerson = injuredPerson;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getExposedIndividuals() {
		return exposedIndividuals;
	}

	public void setExposedIndividuals(int exposedIndividuals) {
		this.exposedIndividuals = exposedIndividuals;
	}

	public int getContaminatedIndividuals() {
		return contaminatedIndividuals;
	}

	public void setContaminatedIndividuals(int contaminatedIndividuals) {
		this.contaminatedIndividuals = contaminatedIndividuals;
	}

	public String getMonitoryChallenges() {
		return monitoryChallenges;
	}

	public void setMonitoryChallenges(String monitoryChallenges) {
		this.monitoryChallenges = monitoryChallenges;
	}
	
	
	
}
