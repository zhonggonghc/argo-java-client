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
import io.argoproj.workflow.v1alpha1.ArchiveStrategy;
import io.argoproj.workflow.v1alpha1.ArtifactoryArtifact;
import io.argoproj.workflow.v1alpha1.GitArtifact;
import io.argoproj.workflow.v1alpha1.HDFSArtifact;
import io.argoproj.workflow.v1alpha1.HTTPArtifact;
import io.argoproj.workflow.v1alpha1.RawArtifact;
import io.argoproj.workflow.v1alpha1.S3Artifact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Artifact indicates an artifact to place at a specified path
 */
@ApiModel(description = "Artifact indicates an artifact to place at a specified path")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-02T13:36:12.841+03:30[Asia/Tehran]")
public class Artifact {
  public static final String SERIALIZED_NAME_ARCHIVE = "archive";
  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  private ArchiveStrategy archive = null;

  public static final String SERIALIZED_NAME_ARCHIVE_LOGS = "archiveLogs";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOGS)
  private Boolean archiveLogs;

  public static final String SERIALIZED_NAME_ARTIFACTORY = "artifactory";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY)
  private ArtifactoryArtifact artifactory = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private GitArtifact git = null;

  public static final String SERIALIZED_NAME_GLOBAL_NAME = "globalName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_NAME)
  private String globalName;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  private HDFSArtifact hdfs = null;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private HTTPArtifact http = null;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private RawArtifact raw = null;

  public static final String SERIALIZED_NAME_S3 = "s3";
  @SerializedName(SERIALIZED_NAME_S3)
  private S3Artifact s3 = null;

  public Artifact archive(ArchiveStrategy archive) {
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @ApiModelProperty(value = "")
  public ArchiveStrategy getArchive() {
    return archive;
  }

  public void setArchive(ArchiveStrategy archive) {
    this.archive = archive;
  }

  public Artifact archiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
    return this;
  }

   /**
   * ArchiveLogs indicates if the container logs should be archived
   * @return archiveLogs
  **/
  @ApiModelProperty(value = "ArchiveLogs indicates if the container logs should be archived")
  public Boolean getArchiveLogs() {
    return archiveLogs;
  }

  public void setArchiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }

  public Artifact artifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
    return this;
  }

   /**
   * Get artifactory
   * @return artifactory
  **/
  @ApiModelProperty(value = "")
  public ArtifactoryArtifact getArtifactory() {
    return artifactory;
  }

  public void setArtifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
  }

  public Artifact from(String from) {
    this.from = from;
    return this;
  }

   /**
   * From allows an artifact to reference an artifact from a previous step
   * @return from
  **/
  @ApiModelProperty(value = "From allows an artifact to reference an artifact from a previous step")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Artifact git(GitArtifact git) {
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @ApiModelProperty(value = "")
  public GitArtifact getGit() {
    return git;
  }

  public void setGit(GitArtifact git) {
    this.git = git;
  }

  public Artifact globalName(String globalName) {
    this.globalName = globalName;
    return this;
  }

   /**
   * GlobalName exports an output artifact to the global scope, making it available as &#39;{{workflow.outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts
   * @return globalName
  **/
  @ApiModelProperty(value = "GlobalName exports an output artifact to the global scope, making it available as '{{workflow.outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts")
  public String getGlobalName() {
    return globalName;
  }

  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }

  public Artifact hdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
    return this;
  }

   /**
   * Get hdfs
   * @return hdfs
  **/
  @ApiModelProperty(value = "")
  public HDFSArtifact getHdfs() {
    return hdfs;
  }

  public void setHdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
  }

  public Artifact http(HTTPArtifact http) {
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @ApiModelProperty(value = "")
  public HTTPArtifact getHttp() {
    return http;
  }

  public void setHttp(HTTPArtifact http) {
    this.http = http;
  }

  public Artifact mode(Integer mode) {
    this.mode = mode;
    return this;
  }

   /**
   * mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.
   * @return mode
  **/
  @ApiModelProperty(value = "mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public Artifact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the artifact. must be unique within a template&#39;s inputs/outputs.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name of the artifact. must be unique within a template's inputs/outputs.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Artifact path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path is the container path to the artifact
   * @return path
  **/
  @ApiModelProperty(value = "Path is the container path to the artifact")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Artifact raw(RawArtifact raw) {
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @ApiModelProperty(value = "")
  public RawArtifact getRaw() {
    return raw;
  }

  public void setRaw(RawArtifact raw) {
    this.raw = raw;
  }

  public Artifact s3(S3Artifact s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public S3Artifact getS3() {
    return s3;
  }

  public void setS3(S3Artifact s3) {
    this.s3 = s3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artifact ioArgoprojWorkflowV1alpha1Artifact = (Artifact) o;
    return Objects.equals(this.archive, ioArgoprojWorkflowV1alpha1Artifact.archive) &&
        Objects.equals(this.archiveLogs, ioArgoprojWorkflowV1alpha1Artifact.archiveLogs) &&
        Objects.equals(this.artifactory, ioArgoprojWorkflowV1alpha1Artifact.artifactory) &&
        Objects.equals(this.from, ioArgoprojWorkflowV1alpha1Artifact.from) &&
        Objects.equals(this.git, ioArgoprojWorkflowV1alpha1Artifact.git) &&
        Objects.equals(this.globalName, ioArgoprojWorkflowV1alpha1Artifact.globalName) &&
        Objects.equals(this.hdfs, ioArgoprojWorkflowV1alpha1Artifact.hdfs) &&
        Objects.equals(this.http, ioArgoprojWorkflowV1alpha1Artifact.http) &&
        Objects.equals(this.mode, ioArgoprojWorkflowV1alpha1Artifact.mode) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Artifact.name) &&
        Objects.equals(this.path, ioArgoprojWorkflowV1alpha1Artifact.path) &&
        Objects.equals(this.raw, ioArgoprojWorkflowV1alpha1Artifact.raw) &&
        Objects.equals(this.s3, ioArgoprojWorkflowV1alpha1Artifact.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archive, archiveLogs, artifactory, from, git, globalName, hdfs, http, mode, name, path, raw, s3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Artifact {\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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

