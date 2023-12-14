package org.jmresler.jpa.model.dtos;

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

public class AgenciesDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer agencyId;
    private Integer yearlyAgencyId;
    private Integer dataYear;
    private String ori;
    private String legacyOri;
    private String coveredByLegacyOri;
    private String directContributorFlag;
    private String dormantFlag;
    private Integer dormantYear;
    private String reportingType;
    private String ucrAgencyName;
    private String ncicAgencyName;
    private String pubAgencyName;
    private String pubAgencyUnit;
    private String agencyStatus;
    private Integer stateId;
    private String stateName;
    private String stateAbbr;
    private String statePostalAbbr;
    private Integer divisionCode;
    private String divisionName;
    private Integer regionCode;
    private String regionName;
    private String regionDesc;
    private String agencyTypeName;
    private Integer population;
    private Integer submittingAgencyId;
    private String sai;
    private String submittingAgencyName;
    private String suburbanAreaFlag;
    private Integer populationGroupId;
    private String populationGroupCode;
    private String populationGroupDesc;
    private Integer parentPopGroupCode;
    private String parentPopGroupDesc;
    private String mipFlag;
    private Integer popSortOrder;
    private String summaryRapeDef;
    private String peReportedFlag;
    private Integer maleOfficer;
    private Integer maleCivilian;
    private Integer maleTotal;
    private Integer femaleOfficer;
    private Integer femaleCivilian;
    private Integer femaleTotal;
    private BigDecimal officerRate;
    private BigDecimal employeeRate;
    private Date nibrsCertDate;
    private Date nibrsStartDate;
    private Date nibrsLeokaStartDate;
    private Date nibrsCtStartDate;
    private Date nibrsMultiBiasStartDate;
    private Date nibrsOffEthStartDate;
    private String coveredFlag;
    private String countyName;
    private String msaName;
    private String publishableFlag;
    private String participated;
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

    @Override
    public String toString() {
        return "org.jmresler.fbi.nibrs.AgenciesDTO[" + agencyId + "]";
    }


}
