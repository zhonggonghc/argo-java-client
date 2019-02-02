/*
 * Argo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v2.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.v1alpha1;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.v1alpha1.Arguments;
import io.argoproj.workflow.v1alpha1.Sequence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAGTask represents a node in the graph during DAG execution
 */
@ApiModel(description = "DAGTask represents a node in the graph during DAG execution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-02T13:36:12.841+03:30[Asia/Tehran]")
public class DAGTask {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Arguments arguments = null;

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<String> dependencies = new ArrayList<String>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private String when;

  public static final String SERIALIZED_NAME_WITH_ITEMS = "withItems";
  @SerializedName(SERIALIZED_NAME_WITH_ITEMS)
  private List<String> withItems = new ArrayList<String>();

  public static final String SERIALIZED_NAME_WITH_PARAM = "withParam";
  @SerializedName(SERIALIZED_NAME_WITH_PARAM)
  private String withParam;

  public static final String SERIALIZED_NAME_WITH_SEQUENCE = "withSequence";
  @SerializedName(SERIALIZED_NAME_WITH_SEQUENCE)
  private Sequence withSequence = null;

  public DAGTask arguments(Arguments arguments) {
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @ApiModelProperty(value = "")
  public Arguments getArguments() {
    return arguments;
  }

  public void setArguments(Arguments arguments) {
    this.arguments = arguments;
  }

  public DAGTask dependencies(List<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public DAGTask addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<String>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Dependencies are name of other targets which this depends on
   * @return dependencies
  **/
  @ApiModelProperty(value = "Dependencies are name of other targets which this depends on")
  public List<String> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }

  public DAGTask name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the target
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of the target")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DAGTask template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Name of template to execute
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Name of template to execute")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public DAGTask when(String when) {
    this.when = when;
    return this;
  }

   /**
   * When is an expression in which the task should conditionally execute
   * @return when
  **/
  @ApiModelProperty(value = "When is an expression in which the task should conditionally execute")
  public String getWhen() {
    return when;
  }

  public void setWhen(String when) {
    this.when = when;
  }

  public DAGTask withItems(List<String> withItems) {
    this.withItems = withItems;
    return this;
  }

  public DAGTask addWithItemsItem(String withItemsItem) {
    if (this.withItems == null) {
      this.withItems = new ArrayList<String>();
    }
    this.withItems.add(withItemsItem);
    return this;
  }

   /**
   * WithItems expands a task into multiple parallel tasks from the items in the list
   * @return withItems
  **/
  @ApiModelProperty(value = "WithItems expands a task into multiple parallel tasks from the items in the list")
  public List<String> getWithItems() {
    return withItems;
  }

  public void setWithItems(List<String> withItems) {
    this.withItems = withItems;
  }

  public DAGTask withParam(String withParam) {
    this.withParam = withParam;
    return this;
  }

   /**
   * WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list.
   * @return withParam
  **/
  @ApiModelProperty(value = "WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list.")
  public String getWithParam() {
    return withParam;
  }

  public void setWithParam(String withParam) {
    this.withParam = withParam;
  }

  public DAGTask withSequence(Sequence withSequence) {
    this.withSequence = withSequence;
    return this;
  }

   /**
   * Get withSequence
   * @return withSequence
  **/
  @ApiModelProperty(value = "")
  public Sequence getWithSequence() {
    return withSequence;
  }

  public void setWithSequence(Sequence withSequence) {
    this.withSequence = withSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGTask ioArgoprojWorkflowV1alpha1DAGTask = (DAGTask) o;
    return Objects.equals(this.arguments, ioArgoprojWorkflowV1alpha1DAGTask.arguments) &&
        Objects.equals(this.dependencies, ioArgoprojWorkflowV1alpha1DAGTask.dependencies) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1DAGTask.name) &&
        Objects.equals(this.template, ioArgoprojWorkflowV1alpha1DAGTask.template) &&
        Objects.equals(this.when, ioArgoprojWorkflowV1alpha1DAGTask.when) &&
        Objects.equals(this.withItems, ioArgoprojWorkflowV1alpha1DAGTask.withItems) &&
        Objects.equals(this.withParam, ioArgoprojWorkflowV1alpha1DAGTask.withParam) &&
        Objects.equals(this.withSequence, ioArgoprojWorkflowV1alpha1DAGTask.withSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, dependencies, name, template, when, withItems, withParam, withSequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1DAGTask {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    withItems: ").append(toIndentedString(withItems)).append("\n");
    sb.append("    withParam: ").append(toIndentedString(withParam)).append("\n");
    sb.append("    withSequence: ").append(toIndentedString(withSequence)).append("\n");
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

