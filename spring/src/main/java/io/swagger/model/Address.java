package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address
 */
@Validated

public class Address  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("line1")
  private String line1 = null;

  @JsonProperty("line2")
  private String line2 = null;

  @JsonProperty("line3")
  private String line3 = null;

  @JsonProperty("line4")
  private String line4 = null;

  @JsonProperty("line5")
  private String line5 = null;

  public Address line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Get line1
   * @return line1
  **/
  @ApiModelProperty(example = "Accenture", required = true, value = "")
  @NotNull


  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public Address line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Get line2
   * @return line2
  **/
  @ApiModelProperty(example = "9c Cobalt Business park", value = "")


  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public Address line3(String line3) {
    this.line3 = line3;
    return this;
  }

   /**
   * Get line3
   * @return line3
  **/
  @ApiModelProperty(example = "Newcastle", value = "")


  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public Address line4(String line4) {
    this.line4 = line4;
    return this;
  }

   /**
   * Get line4
   * @return line4
  **/
  @ApiModelProperty(example = "Tyne and Wear", value = "")


  public String getLine4() {
    return line4;
  }

  public void setLine4(String line4) {
    this.line4 = line4;
  }

  public Address line5(String line5) {
    this.line5 = line5;
    return this;
  }

   /**
   * Get line5
   * @return line5
  **/
  @ApiModelProperty(example = "Newcastle", value = "")


  public String getLine5() {
    return line5;
  }

  public void setLine5(String line5) {
    this.line5 = line5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.line3, address.line3) &&
        Objects.equals(this.line4, address.line4) &&
        Objects.equals(this.line5, address.line5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, line3, line4, line5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line4: ").append(toIndentedString(line4)).append("\n");
    sb.append("    line5: ").append(toIndentedString(line5)).append("\n");
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

