package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "service_bindings")
public class ServiceBinding {

    @Id
    private String id;

    @Field
    private String instanceId;

    @Field
    private String serviceId;

    @Field
    private String planId;

    @Field
    private String appGuid;

    @Field
    private Credentials credentials;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getAppGuid() {
        return appGuid;
    }

    public void setAppGuid(String appGuid) {
        this.appGuid = appGuid;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceBinding that = (ServiceBinding) o;

        if (!appGuid.equals(that.appGuid)) return false;
        if (!id.equals(that.id)) return false;
        if (!instanceId.equals(that.instanceId)) return false;
        if (!planId.equals(that.planId)) return false;
        if (!serviceId.equals(that.serviceId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + instanceId.hashCode();
        result = 31 * result + serviceId.hashCode();
        result = 31 * result + planId.hashCode();
        result = 31 * result + appGuid.hashCode();
        return result;
    }
}
