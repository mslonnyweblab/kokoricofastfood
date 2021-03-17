package br.com.manager.basedados.models.coremodelsasterisk;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "ps_endpoint_id_ips")
public class PsEndPointIdIps implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = true, length = 100)
    private Integer id;

    @Column(name = "endpoint", nullable = true, length = 40)
    private String endpoint;

    @Column(name = "\"match\"", nullable = true, length = 255)
    private String match;

    @Column(name = "srv_lookups", nullable = true, length = 3)
    private String srvLookups;

    @Column(name = "match_header", nullable = true, length = 255)
    private String matchHeader;

    public PsEndPointIdIps() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getSrvLookups() {
        return srvLookups;
    }

    public void setSrvLookups(String srvLookups) {
        this.srvLookups = srvLookups;
    }

    public String getMatchHeader() {
        return matchHeader;
    }

    public void setMatchHeader(String matchHeader) {
        this.matchHeader = matchHeader;
    }
}