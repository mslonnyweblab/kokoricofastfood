package br.com.manager.basedados.models.coremodelsasterisk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;



@Entity
@Table(name = "ps_registrations")
public class PsRegistrations implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id", nullable = true, length = 100)
    private Integer id;

    @Column(name = "client_uri", nullable = false, length = 255)
    private String clientUri;

    @Column(name = "outbound_auth", nullable = false, length = 40)
    private String outboundAuth;

    @Column(name = "server_uri", nullable = false, length = 255)
    private String serverUri;

    @Column(name = "auth_rejection_permanent", nullable = true, length = 3)
    private String authRejectionPermanent = "no";

    @Column(name = "contact_user", nullable = true, length = 40)
    private String contactUser;

    @Column(name = "expiration", nullable = true, length = 11)
    private Integer expiration;

    @Column(name = "max_retries", nullable = true, length = 11)
    private Integer maxRetries = 10;

    @Column(name = "outbound_proxy", nullable = true, length = 40)
    private String outboundProxy;

    @Column(name = "retry_interval", nullable = true, length = 11)
    private Integer retryInterval;

    @Column(name = "forbidden_retry_interval", nullable = true, length = 11)
    private Integer forbiddenRetryInterval = 300;

    @Column(name = "transport", nullable = true, length = 60)
    private String transport = "transport-udp";

    @Column(name = "support_path", nullable = true, length = 3)
    private String supportPath;

    @Column(name = "fatal_retry_interval", nullable = true, length = 11)
    private Integer fatalRetryInterval = 300;

    @Column(name = "line", nullable = true, length = 3)
    private Integer line;

    @Column(name = "endpoint", nullable = true, length = 40)
    private String endpoint;

    public PsRegistrations() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientUri() {
        return clientUri;
    }

    public void setClientUri(String clientUri) {
        this.clientUri = clientUri;
    }

    public String getOutboundAuth() {
        return outboundAuth;
    }

    public void setOutboundAuth(String outboundAuth) {
        this.outboundAuth = outboundAuth;
    }

    public String getServerUri() {
        return serverUri;
    }

    public void setServerUri(String serverUri) {
        this.serverUri = serverUri;
    }

    public String getAuthRejectionPermanent() {
        return authRejectionPermanent;
    }

    public void setAuthRejectionPermanent(String authRejectionPermanent) {
        this.authRejectionPermanent = authRejectionPermanent;
    }

    public String getContactUser() {
        return contactUser;
    }

    public void setContactUser(String contactUser) {
        this.contactUser = contactUser;
    }

    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    public String getOutboundProxy() {
        return outboundProxy;
    }

    public void setOutboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
    }

    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    public Integer getForbiddenRetryInterval() {
        return forbiddenRetryInterval;
    }

    public void setForbiddenRetryInterval(Integer forbiddenRetryInterval) {
        this.forbiddenRetryInterval = forbiddenRetryInterval;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getSupportPath() {
        return supportPath;
    }

    public void setSupportPath(String supportPath) {
        this.supportPath = supportPath;
    }

    public Integer getFatalRetryInterval() {
        return fatalRetryInterval;
    }

    public void setFatalRetryInterval(Integer fatalRetryInterval) {
        this.fatalRetryInterval = fatalRetryInterval;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}