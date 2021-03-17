package br.com.manager.basedados.models.coremodelsasterisk;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ps_aors")
public class PsAors implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = true, length = 100)
    private Integer id;

    @Column(name = "contact", nullable = false, length = 255, precision = 37, scale = 0)
    private String contact;

    @Column(name = "default_expiration", nullable = true, length = 11)
    private Integer defaultExpiration;

    @Column(name = "mailboxes", nullable = true, length = 80)
    private String mailboxes;

    @Column(name = "max_contacts", nullable = true, length = 11)
    private Integer maxContacts = 1;

    @Column(name = "minimum_expiration", nullable = true, length = 11)
    private Integer minimumExpiration;

    @Column(name = "remove_existing", nullable = true, length = 3)
    private Integer removeExisting; // yes or no

    @Column(name = "qualify_frequency", nullable = true, length = 11)
    private Integer qualifyFrequency;

    @Column(name = "authenticate_qualify", nullable = true, length = 3)
    private Integer authenticateQualify; // yes or no

    @Column(name = "maximum_expiration", nullable = true, length = 11)
    private Integer maximumExpiration;

    @Column(name = "outbound_proxy", nullable = true, length = 255)
    private String outboundProxy;

    @Column(name = "support_path", nullable = true, length = 3)
    private Integer supportPath; // yes or no

    @Column(name = "qualify_timeout", nullable = true, length = 12)
    private Float qualifyTimeout;

    @Column(name = "voicemail_extension", nullable = true, length = 40)
    private String voicemailExtension;


    public PsAors() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getDefaultExpiration() {
        return defaultExpiration;
    }

    public void setDefaultExpiration(Integer defaultExpiration) {
        this.defaultExpiration = defaultExpiration;
    }

    public String getMailboxes() {
        return mailboxes;
    }

    public void setMailboxes(String mailboxes) {
        this.mailboxes = mailboxes;
    }

    public Integer getMaxContacts() {
        return maxContacts;
    }

    public void setMaxContacts(Integer maxContacts) {
        this.maxContacts = maxContacts;
    }

    public Integer getMinimumExpiration() {
        return minimumExpiration;
    }

    public void setMinimumExpiration(Integer minimumExpiration) {
        this.minimumExpiration = minimumExpiration;
    }

    public Integer getRemoveExisting() {
        return removeExisting;
    }

    public void setRemoveExisting(Integer removeExisting) {
        this.removeExisting = removeExisting;
    }

    public Integer getQualifyFrequency() {
        return qualifyFrequency;
    }

    public void setQualifyFrequency(Integer qualifyFrequency) {
        this.qualifyFrequency = qualifyFrequency;
    }

    public Integer getAuthenticateQualify() {
        return authenticateQualify;
    }

    public void setAuthenticateQualify(Integer authenticateQualify) {
        this.authenticateQualify = authenticateQualify;
    }

    public Integer getMaximumExpiration() {
        return maximumExpiration;
    }

    public void setMaximumExpiration(Integer maximumExpiration) {
        this.maximumExpiration = maximumExpiration;
    }

    public String getOutboundProxy() {
        return outboundProxy;
    }

    public void setOutboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
    }

    public Integer getSupportPath() {
        return supportPath;
    }

    public void setSupportPath(Integer supportPath) {
        this.supportPath = supportPath;
    }

    public Float getQualifyTimeout() {
        return qualifyTimeout;
    }

    public void setQualifyTimeout(Float qualifyTimeout) {
        this.qualifyTimeout = qualifyTimeout;
    }

    public String getVoicemailExtension() {
        return voicemailExtension;
    }

    public void setVoicemailExtension(String voicemailExtension) {
        this.voicemailExtension = voicemailExtension;
    }
}
