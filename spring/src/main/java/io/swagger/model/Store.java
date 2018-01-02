package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Store
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-02T15:13:05.661Z")

public class Store   {
  @JsonProperty("accountingStartDate")
  private LocalDate accountingStartDate = null;

  @JsonProperty("accountingEndDate")
  private LocalDate accountingEndDate = null;

  @JsonProperty("businessName")
  private String businessName = null;

  @JsonProperty("contractObjectId")
  private Long contractObjectId = null;

  @JsonProperty("nino")
  private String nino = null;

  @JsonProperty("type")
  private Long type = null;

  public Store accountingStartDate(LocalDate accountingStartDate) {
    this.accountingStartDate = accountingStartDate;
    return this;
  }

   /**
   * Get accountingStartDate
   * @return accountingStartDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getAccountingStartDate() {
    return accountingStartDate;
  }

  public void setAccountingStartDate(LocalDate accountingStartDate) {
    this.accountingStartDate = accountingStartDate;
  }

  public Store accountingEndDate(LocalDate accountingEndDate) {
    this.accountingEndDate = accountingEndDate;
    return this;
  }

   /**
   * Get accountingEndDate
   * @return accountingEndDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getAccountingEndDate() {
    return accountingEndDate;
  }

  public void setAccountingEndDate(LocalDate accountingEndDate) {
    this.accountingEndDate = accountingEndDate;
  }

  public Store businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @ApiModelProperty(value = "")


  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Store contractObjectId(Long contractObjectId) {
    this.contractObjectId = contractObjectId;
    return this;
  }

   /**
   * Get contractObjectId
   * @return contractObjectId
  **/
  @ApiModelProperty(value = "")


  public Long getContractObjectId() {
    return contractObjectId;
  }

  public void setContractObjectId(Long contractObjectId) {
    this.contractObjectId = contractObjectId;
  }

  public Store nino(String nino) {
    this.nino = nino;
    return this;
  }

   /**
   * Get nino
   * @return nino
  **/
  @ApiModelProperty(value = "")


  public String getNino() {
    return nino;
  }

  public void setNino(String nino) {
    this.nino = nino;
  }

  public Store type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.accountingStartDate, store.accountingStartDate) &&
        Objects.equals(this.accountingEndDate, store.accountingEndDate) &&
        Objects.equals(this.businessName, store.businessName) &&
        Objects.equals(this.contractObjectId, store.contractObjectId) &&
        Objects.equals(this.nino, store.nino) &&
        Objects.equals(this.type, store.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingStartDate, accountingEndDate, businessName, contractObjectId, nino, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    
    sb.append("    accountingStartDate: ").append(toIndentedString(accountingStartDate)).append("\n");
    sb.append("    accountingEndDate: ").append(toIndentedString(accountingEndDate)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    contractObjectId: ").append(toIndentedString(contractObjectId)).append("\n");
    sb.append("    nino: ").append(toIndentedString(nino)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

