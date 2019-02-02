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
import io.argoproj.workflow.v1alpha1.ArtifactLocation;
import io.argoproj.workflow.v1alpha1.DAGTemplate;
import io.argoproj.workflow.v1alpha1.Inputs;
import io.argoproj.workflow.v1alpha1.Metadata;
import io.argoproj.workflow.v1alpha1.Outputs;
import io.argoproj.workflow.v1alpha1.ResourceTemplate;
import io.argoproj.workflow.v1alpha1.RetryStrategy;
import io.argoproj.workflow.v1alpha1.ScriptTemplate;
import io.argoproj.workflow.v1alpha1.Sidecar;
import io.argoproj.workflow.v1alpha1.WorkflowStep;
import io.kubernetes.client.proto.V1.Affinity;
import io.kubernetes.client.proto.V1.Container;
import io.kubernetes.client.proto.V1.Toleration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Template is a reusable and composable unit of execution in a workflow
 */
@ApiModel(description = "Template is a reusable and composable unit of execution in a workflow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-02T13:36:12.841+03:30[Asia/Tehran]")
public class Template {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private Long activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private Affinity affinity = null;

  public static final String SERIALIZED_NAME_ARCHIVE_LOCATION = "archiveLocation";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOCATION)
  private ArtifactLocation archiveLocation = null;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private Container container = null;

  public static final String SERIALIZED_NAME_DAEMON = "daemon";
  @SerializedName(SERIALIZED_NAME_DAEMON)
  private Boolean daemon;

  public static final String SERIALIZED_NAME_DAG = "dag";
  @SerializedName(SERIALIZED_NAME_DAG)
  private DAGTemplate dag = null;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Inputs inputs = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private Outputs outputs = null;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Long parallelism;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private ResourceTemplate resource = null;

  public static final String SERIALIZED_NAME_RETRY_STRATEGY = "retryStrategy";
  @SerializedName(SERIALIZED_NAME_RETRY_STRATEGY)
  private RetryStrategy retryStrategy = null;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private ScriptTemplate script = null;

  public static final String SERIALIZED_NAME_SIDECARS = "sidecars";
  @SerializedName(SERIALIZED_NAME_SIDECARS)
  private List<Sidecar> sidecars = new ArrayList<Sidecar>();

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<List<WorkflowStep>> steps = new ArrayList<List<WorkflowStep>>();

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";
  @SerializedName(SERIALIZED_NAME_SUSPEND)
  private Object suspend = null;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<Toleration> tolerations = new ArrayList<Toleration>();

  public Template activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates.
   * @return activeDeadlineSeconds
  **/
  @ApiModelProperty(value = "Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public Template affinity(Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @ApiModelProperty(value = "")
  public Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(Affinity affinity) {
    this.affinity = affinity;
  }

  public Template archiveLocation(ArtifactLocation archiveLocation) {
    this.archiveLocation = archiveLocation;
    return this;
  }

   /**
   * Get archiveLocation
   * @return archiveLocation
  **/
  @ApiModelProperty(value = "")
  public ArtifactLocation getArchiveLocation() {
    return archiveLocation;
  }

  public void setArchiveLocation(ArtifactLocation archiveLocation) {
    this.archiveLocation = archiveLocation;
  }

  public Template container(Container container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @ApiModelProperty(value = "")
  public Container getContainer() {
    return container;
  }

  public void setContainer(Container container) {
    this.container = container;
  }

  public Template daemon(Boolean daemon) {
    this.daemon = daemon;
    return this;
  }

   /**
   * Deamon will allow a workflow to proceed to the next step so long as the container reaches readiness
   * @return daemon
  **/
  @ApiModelProperty(value = "Deamon will allow a workflow to proceed to the next step so long as the container reaches readiness")
  public Boolean getDaemon() {
    return daemon;
  }

  public void setDaemon(Boolean daemon) {
    this.daemon = daemon;
  }

  public Template dag(DAGTemplate dag) {
    this.dag = dag;
    return this;
  }

   /**
   * Get dag
   * @return dag
  **/
  @ApiModelProperty(value = "")
  public DAGTemplate getDag() {
    return dag;
  }

  public void setDag(DAGTemplate dag) {
    this.dag = dag;
  }

  public Template inputs(Inputs inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")
  public Inputs getInputs() {
    return inputs;
  }

  public void setInputs(Inputs inputs) {
    this.inputs = inputs;
  }

  public Template metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public Template name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the template
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of the template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Template nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public Template putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.
   * @return nodeSelector
  **/
  @ApiModelProperty(value = "NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public Template outputs(Outputs outputs) {
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public Outputs getOutputs() {
    return outputs;
  }

  public void setOutputs(Outputs outputs) {
    this.outputs = outputs;
  }

  public Template parallelism(Long parallelism) {
    this.parallelism = parallelism;
    return this;
  }

   /**
   * Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.
   * @return parallelism
  **/
  @ApiModelProperty(value = "Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.")
  public Long getParallelism() {
    return parallelism;
  }

  public void setParallelism(Long parallelism) {
    this.parallelism = parallelism;
  }

  public Template resource(ResourceTemplate resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(value = "")
  public ResourceTemplate getResource() {
    return resource;
  }

  public void setResource(ResourceTemplate resource) {
    this.resource = resource;
  }

  public Template retryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

   /**
   * Get retryStrategy
   * @return retryStrategy
  **/
  @ApiModelProperty(value = "")
  public RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  public Template script(ScriptTemplate script) {
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @ApiModelProperty(value = "")
  public ScriptTemplate getScript() {
    return script;
  }

  public void setScript(ScriptTemplate script) {
    this.script = script;
  }

  public Template sidecars(List<Sidecar> sidecars) {
    this.sidecars = sidecars;
    return this;
  }

  public Template addSidecarsItem(Sidecar sidecarsItem) {
    if (this.sidecars == null) {
      this.sidecars = new ArrayList<Sidecar>();
    }
    this.sidecars.add(sidecarsItem);
    return this;
  }

   /**
   * Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes
   * @return sidecars
  **/
  @ApiModelProperty(value = "Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes")
  public List<Sidecar> getSidecars() {
    return sidecars;
  }

  public void setSidecars(List<Sidecar> sidecars) {
    this.sidecars = sidecars;
  }

  public Template steps(List<List<WorkflowStep>> steps) {
    this.steps = steps;
    return this;
  }

  public Template addStepsItem(List<WorkflowStep> stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<List<WorkflowStep>>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Steps define a series of sequential/parallel workflow steps
   * @return steps
  **/
  @ApiModelProperty(value = "Steps define a series of sequential/parallel workflow steps")
  public List<List<WorkflowStep>> getSteps() {
    return steps;
  }

  public void setSteps(List<List<WorkflowStep>> steps) {
    this.steps = steps;
  }

  public Template suspend(Object suspend) {
    this.suspend = suspend;
    return this;
  }

   /**
   * SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time
   * @return suspend
  **/
  @ApiModelProperty(value = "SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time")
  public Object getSuspend() {
    return suspend;
  }

  public void setSuspend(Object suspend) {
    this.suspend = suspend;
  }

  public Template tolerations(List<Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public Template addTolerationsItem(Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Tolerations to apply to workflow pods.
   * @return tolerations
  **/
  @ApiModelProperty(value = "Tolerations to apply to workflow pods.")
  public List<Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template ioArgoprojWorkflowV1alpha1Template = (Template) o;
    return Objects.equals(this.activeDeadlineSeconds, ioArgoprojWorkflowV1alpha1Template.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, ioArgoprojWorkflowV1alpha1Template.affinity) &&
        Objects.equals(this.archiveLocation, ioArgoprojWorkflowV1alpha1Template.archiveLocation) &&
        Objects.equals(this.container, ioArgoprojWorkflowV1alpha1Template.container) &&
        Objects.equals(this.daemon, ioArgoprojWorkflowV1alpha1Template.daemon) &&
        Objects.equals(this.dag, ioArgoprojWorkflowV1alpha1Template.dag) &&
        Objects.equals(this.inputs, ioArgoprojWorkflowV1alpha1Template.inputs) &&
        Objects.equals(this.metadata, ioArgoprojWorkflowV1alpha1Template.metadata) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Template.name) &&
        Objects.equals(this.nodeSelector, ioArgoprojWorkflowV1alpha1Template.nodeSelector) &&
        Objects.equals(this.outputs, ioArgoprojWorkflowV1alpha1Template.outputs) &&
        Objects.equals(this.parallelism, ioArgoprojWorkflowV1alpha1Template.parallelism) &&
        Objects.equals(this.resource, ioArgoprojWorkflowV1alpha1Template.resource) &&
        Objects.equals(this.retryStrategy, ioArgoprojWorkflowV1alpha1Template.retryStrategy) &&
        Objects.equals(this.script, ioArgoprojWorkflowV1alpha1Template.script) &&
        Objects.equals(this.sidecars, ioArgoprojWorkflowV1alpha1Template.sidecars) &&
        Objects.equals(this.steps, ioArgoprojWorkflowV1alpha1Template.steps) &&
        Objects.equals(this.suspend, ioArgoprojWorkflowV1alpha1Template.suspend) &&
        Objects.equals(this.tolerations, ioArgoprojWorkflowV1alpha1Template.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, archiveLocation, container, daemon, dag, inputs, metadata, name, nodeSelector, outputs, parallelism, resource, retryStrategy, script, sidecars, steps, suspend, tolerations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Template {\n");
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
    sb.append("    dag: ").append(toIndentedString(dag)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

