package org.jmresler.jpa.model;

/*
 * Copyright 2023 jmres.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The AgenciesDTO class represents a database entity that stores information about law enforcement agencies.
 * This class is annotated with @Data, @Entity, and @Table annotations to configure its behavior as a
 * persistent entity in the database.
 */
@Entity
@Table(name = "agencies")
public class Agencies implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "agency_id", nullable = false)
    private Integer agencyId;
    @Column(name = "yearly_agency_id")
    private Integer yearlyAgencyId;
    @Column(name = "data_year")
    private Integer dataYear;
    @Column(name = "ori", length = 25)
    private String ori;
    @Column(name = "legacy_ori", length = 25)
    private String legacyOri;
    @Column(name = "covered_by_legacy_ori", length = 25)
    private String coveredByLegacyOri;
    @Column(name = "direct_contributor_flag", length = 1)
    private String directContributorFlag;
    @Column(name = "dormant_flag", length = 1)
    private String dormantFlag;
    @Column(name = "dormant_year")
    private Integer dormantYear;
    @Column(name = "reporting_type", length = 1)
    private String reportingType;
    @Column(name = "ucr_agency_name", length = 100)
    private String ucrAgencyName;
    @Column(name = "ncic_agency_name", length = 100)
    private String ncicAgencyName;
    @Column(name = "pub_agency_name", length = 100)
    private String pubAgencyName;
    @Column(name = "pub_agency_unit", length = 100)
    private String pubAgencyUnit;
    @Column(name = "agency_status", length = 1)
    private String agencyStatus;
    @Column(name = "state_id")
    private Integer stateId;
    @Column(name = "state_name", length = 100)
    private String stateName;
    @Column(name = "state_abbr", length = 2)
    private String stateAbbr;
    @Column(name = "state_postal_abbr", length = 2)
    private String statePostalAbbr;
    @Column(name = "division_code")
    private Integer divisionCode;
    @Column(name = "division_name", length = 100)
    private String divisionName;
    @Column(name = "region_code")
    private Integer regionCode;
    @Column(name = "region_name", length = 100)
    private String regionName;
    @Column(name = "region_desc", length = 100)
    private String regionDesc;
    @Column(name = "agency_type_name", length = 100)
    private String agencyTypeName;
    @Column(name = "population")
    private Integer population;
    @Column(name = "submitting_agency_id")
    private Integer submittingAgencyId;
    @Column(name = "sai", length = 25)
    private String sai;
    @Column(name = "submitting_agency_name", length = 200)
    private String submittingAgencyName;
    @Column(name = "suburban_area_flag", length = 1)
    private String suburbanAreaFlag;
    @Column(name = "population_group_id")
    private Integer populationGroupId;
    @Column(name = "population_group_code", length = 2)
    private String populationGroupCode;
    @Column(name = "population_group_desc", length = 100)
    private String populationGroupDesc;
    @Column(name = "parent_pop_group_code")
    private Integer parentPopGroupCode;
    @Column(name = "parent_pop_group_desc", length = 100)
    private String parentPopGroupDesc;
    @Column(name = "mip_flag", length = 1)
    private String mipFlag;
    @Column(name = "pop_sort_order")
    private Integer popSortOrder;
    @Column(name = "summary_rape_def", length = 1)
    private String summaryRapeDef;
    @Column(name = "pe_reported_flag", length = 1)
    private String peReportedFlag;
    @Column(name = "male_officer")
    private Integer maleOfficer;
    @Column(name = "male_civilian")
    private Integer maleCivilian;
    @Column(name = "male_total")
    private Integer maleTotal;
    @Column(name = "female_officer")
    private Integer femaleOfficer;
    @Column(name = "female_civilian")
    private Integer femaleCivilian;
    @Column(name = "female_total")
    private Integer femaleTotal;
    @Column(name = "officer_rate")
    private BigDecimal officerRate;
    @Column(name = "employee_rate")
    private BigDecimal employeeRate;
    @Column(name = "nibrs_cert_date")
    @Temporal(TemporalType.DATE)
    private Date nibrsCertDate;
    @Column(name = "nibrs_start_date")
    @Temporal(TemporalType.DATE)
    private Date nibrsStartDate;
    @Column(name = "nibrs_leoka_start_date")
    @Temporal(TemporalType.DATE)
    private Date nibrsLeokaStartDate;
    @Column(name = "nibrs_ct_start_date")
    @Temporal(TemporalType.DATE)
    private Date nibrsCtStartDate;
    @Column(name = "nibrs_multi_bias_start_date")
    @Temporal(TemporalType.DATE)
    private Date nibrsMultiBiasStartDate;
    @Column(name = "nibrs_off_eth_start_date")
    @Temporal(TemporalType.DATE)
    private Date nibrsOffEthStartDate;
    @Column(name = "covered_flag", length = 1)
    private String coveredFlag;
    @Column(name = "county_name", length = 100)
    private String countyName;
    @Column(name = "msa_name", length = 100)
    private String msaName;
    @Column(name = "publishable_flag", length = 1)
    private String publishableFlag;
    @Column(name = "participated", length = 1)
    private String participated;
    @Column(name = "nibrs_participated", length = 1)
    private String nibrsParticipated;

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getYearlyAgencyId() {
        return yearlyAgencyId;
    }

    public void setYearlyAgencyId(Integer yearlyAgencyId) {
        this.yearlyAgencyId = yearlyAgencyId;
    }

    public Integer getDataYear() {
        return dataYear;
    }

    public void setDataYear(Integer dataYear) {
        this.dataYear = dataYear;
    }

    public String getOri() {
        return ori;
    }

    public void setOri(String ori) {
        this.ori = ori;
    }

    public String getLegacyOri() {
        return legacyOri;
    }

    public void setLegacyOri(String legacyOri) {
        this.legacyOri = legacyOri;
    }

    public String getCoveredByLegacyOri() {
        return coveredByLegacyOri;
    }

    public void setCoveredByLegacyOri(String coveredByLegacyOri) {
        this.coveredByLegacyOri = coveredByLegacyOri;
    }

    public String getDirectContributorFlag() {
        return directContributorFlag;
    }

    public void setDirectContributorFlag(String directContributorFlag) {
        this.directContributorFlag = directContributorFlag;
    }

    public String getDormantFlag() {
        return dormantFlag;
    }

    public void setDormantFlag(String dormantFlag) {
        this.dormantFlag = dormantFlag;
    }

    public Integer getDormantYear() {
        return dormantYear;
    }

    public void setDormantYear(Integer dormantYear) {
        this.dormantYear = dormantYear;
    }

    public String getReportingType() {
        return reportingType;
    }

    public void setReportingType(String reportingType) {
        this.reportingType = reportingType;
    }

    public String getUcrAgencyName() {
        return ucrAgencyName;
    }

    public void setUcrAgencyName(String ucrAgencyName) {
        this.ucrAgencyName = ucrAgencyName;
    }

    public String getNcicAgencyName() {
        return ncicAgencyName;
    }

    public void setNcicAgencyName(String ncicAgencyName) {
        this.ncicAgencyName = ncicAgencyName;
    }

    public String getPubAgencyName() {
        return pubAgencyName;
    }

    public void setPubAgencyName(String pubAgencyName) {
        this.pubAgencyName = pubAgencyName;
    }

    public String getPubAgencyUnit() {
        return pubAgencyUnit;
    }

    public void setPubAgencyUnit(String pubAgencyUnit) {
        this.pubAgencyUnit = pubAgencyUnit;
    }

    public String getAgencyStatus() {
        return agencyStatus;
    }

    public void setAgencyStatus(String agencyStatus) {
        this.agencyStatus = agencyStatus;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getStatePostalAbbr() {
        return statePostalAbbr;
    }

    public void setStatePostalAbbr(String statePostalAbbr) {
        this.statePostalAbbr = statePostalAbbr;
    }

    public Integer getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(Integer divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionDesc() {
        return regionDesc;
    }

    public void setRegionDesc(String regionDesc) {
        this.regionDesc = regionDesc;
    }

    public String getAgencyTypeName() {
        return agencyTypeName;
    }

    public void setAgencyTypeName(String agencyTypeName) {
        this.agencyTypeName = agencyTypeName;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getSubmittingAgencyId() {
        return submittingAgencyId;
    }

    public void setSubmittingAgencyId(Integer submittingAgencyId) {
        this.submittingAgencyId = submittingAgencyId;
    }

    public String getSai() {
        return sai;
    }

    public void setSai(String sai) {
        this.sai = sai;
    }

    public String getSubmittingAgencyName() {
        return submittingAgencyName;
    }

    public void setSubmittingAgencyName(String submittingAgencyName) {
        this.submittingAgencyName = submittingAgencyName;
    }

    public String getSuburbanAreaFlag() {
        return suburbanAreaFlag;
    }

    public void setSuburbanAreaFlag(String suburbanAreaFlag) {
        this.suburbanAreaFlag = suburbanAreaFlag;
    }

    public Integer getPopulationGroupId() {
        return populationGroupId;
    }

    public void setPopulationGroupId(Integer populationGroupId) {
        this.populationGroupId = populationGroupId;
    }

    public String getPopulationGroupCode() {
        return populationGroupCode;
    }

    public void setPopulationGroupCode(String populationGroupCode) {
        this.populationGroupCode = populationGroupCode;
    }

    public String getPopulationGroupDesc() {
        return populationGroupDesc;
    }

    public void setPopulationGroupDesc(String populationGroupDesc) {
        this.populationGroupDesc = populationGroupDesc;
    }

    public Integer getParentPopGroupCode() {
        return parentPopGroupCode;
    }

    public void setParentPopGroupCode(Integer parentPopGroupCode) {
        this.parentPopGroupCode = parentPopGroupCode;
    }

    public String getParentPopGroupDesc() {
        return parentPopGroupDesc;
    }

    public void setParentPopGroupDesc(String parentPopGroupDesc) {
        this.parentPopGroupDesc = parentPopGroupDesc;
    }

    public String getMipFlag() {
        return mipFlag;
    }

    public void setMipFlag(String mipFlag) {
        this.mipFlag = mipFlag;
    }

    public Integer getPopSortOrder() {
        return popSortOrder;
    }

    public void setPopSortOrder(Integer popSortOrder) {
        this.popSortOrder = popSortOrder;
    }

    public String getSummaryRapeDef() {
        return summaryRapeDef;
    }

    public void setSummaryRapeDef(String summaryRapeDef) {
        this.summaryRapeDef = summaryRapeDef;
    }

    public String getPeReportedFlag() {
        return peReportedFlag;
    }

    public void setPeReportedFlag(String peReportedFlag) {
        this.peReportedFlag = peReportedFlag;
    }

    public Integer getMaleOfficer() {
        return maleOfficer;
    }

    public void setMaleOfficer(Integer maleOfficer) {
        this.maleOfficer = maleOfficer;
    }

    public Integer getMaleCivilian() {
        return maleCivilian;
    }

    public void setMaleCivilian(Integer maleCivilian) {
        this.maleCivilian = maleCivilian;
    }

    public Integer getMaleTotal() {
        return maleTotal;
    }

    public void setMaleTotal(Integer maleTotal) {
        this.maleTotal = maleTotal;
    }

    public Integer getFemaleOfficer() {
        return femaleOfficer;
    }

    public void setFemaleOfficer(Integer femaleOfficer) {
        this.femaleOfficer = femaleOfficer;
    }

    public Integer getFemaleCivilian() {
        return femaleCivilian;
    }

    public void setFemaleCivilian(Integer femaleCivilian) {
        this.femaleCivilian = femaleCivilian;
    }

    public Integer getFemaleTotal() {
        return femaleTotal;
    }

    public void setFemaleTotal(Integer femaleTotal) {
        this.femaleTotal = femaleTotal;
    }

    public BigDecimal getOfficerRate() {
        return officerRate;
    }

    public void setOfficerRate(BigDecimal officerRate) {
        this.officerRate = officerRate;
    }

    public BigDecimal getEmployeeRate() {
        return employeeRate;
    }

    public void setEmployeeRate(BigDecimal employeeRate) {
        this.employeeRate = employeeRate;
    }

    public Date getNibrsCertDate() {
        return nibrsCertDate;
    }

    public void setNibrsCertDate(Date nibrsCertDate) {
        this.nibrsCertDate = nibrsCertDate;
    }

    public Date getNibrsStartDate() {
        return nibrsStartDate;
    }

    public void setNibrsStartDate(Date nibrsStartDate) {
        this.nibrsStartDate = nibrsStartDate;
    }

    public Date getNibrsLeokaStartDate() {
        return nibrsLeokaStartDate;
    }

    public void setNibrsLeokaStartDate(Date nibrsLeokaStartDate) {
        this.nibrsLeokaStartDate = nibrsLeokaStartDate;
    }

    public Date getNibrsCtStartDate() {
        return nibrsCtStartDate;
    }

    public void setNibrsCtStartDate(Date nibrsCtStartDate) {
        this.nibrsCtStartDate = nibrsCtStartDate;
    }

    public Date getNibrsMultiBiasStartDate() {
        return nibrsMultiBiasStartDate;
    }

    public void setNibrsMultiBiasStartDate(Date nibrsMultiBiasStartDate) {
        this.nibrsMultiBiasStartDate = nibrsMultiBiasStartDate;
    }

    public Date getNibrsOffEthStartDate() {
        return nibrsOffEthStartDate;
    }

    public void setNibrsOffEthStartDate(Date nibrsOffEthStartDate) {
        this.nibrsOffEthStartDate = nibrsOffEthStartDate;
    }

    public String getCoveredFlag() {
        return coveredFlag;
    }

    public void setCoveredFlag(String coveredFlag) {
        this.coveredFlag = coveredFlag;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getMsaName() {
        return msaName;
    }

    public void setMsaName(String msaName) {
        this.msaName = msaName;
    }

    public String getPublishableFlag() {
        return publishableFlag;
    }

    public void setPublishableFlag(String publishableFlag) {
        this.publishableFlag = publishableFlag;
    }

    public String getParticipated() {
        return participated;
    }

    public void setParticipated(String participated) {
        this.participated = participated;
    }

    public String getNibrsParticipated() {
        return nibrsParticipated;
    }

    public void setNibrsParticipated(String nibrsParticipated) {
        this.nibrsParticipated = nibrsParticipated;
    }
}
