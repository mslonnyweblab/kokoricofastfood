package br.com.manager.basedados.models.coremodelsasterisk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "ps_endpoints")
public class PsEndPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = true, length = 100)
    private Integer id;

    @Column(name = "transport", nullable = true, length = 40)
    private String transport = "transport-udp";

    @Column(name = "aors", nullable = false, length = 255)
    private String aors;

    @Column(name = "auth", nullable = false, length = 255)
    private String auth;

    @Column(name = "context", nullable = false, length = 40)
    private String context;

    @Column(name = "from_domain", nullable = false, length = 255)
    private String fromDomain;

    @Column(name = "from_user", nullable = false, length = 255)
    private String fromUser;

    @Column(name = "disallow", nullable = true, length = 200)
    private String disallow = "all";

    @Column(name = "allow", nullable = true, length = 200)
    private String allow = "g729;gsm;ulaw;alaw";

    @Column(name = "direct_media", nullable = true, length = 3)
    private String directMedia = "no";

    @Column(name = "connected_line_method", nullable = true, length = 8)
    private String connectedLineMethod;

    @Column(name = "direct_media_method", nullable = true, length = 8)
    private String directMediaMethod;

    @Column(name = "direct_media_glare_mitigation", nullable = true, length = 8)
    private String directMediaGlareMitigation;

    @Column(name = "disable_direct_media_on_nat", nullable = true, length = 3)
    private String disableDirectMediaOnNat;

    @Column(name = "dtmf_mode", nullable = true, length = 9)
    private String dtmfMode;

    @Column(name = "external_media_address", nullable = true, length = 40)
    private String externalMediaAddress;

    @Column(name = "force_rport", nullable = true, length = 3)
    private String forceRport;

    @Column(name = "ice_support", nullable = true, length = 3)
    private String iceSupport;

    @Column(name = "identify_by", nullable = true, length = 80)
    private String identifyBy;

    @Column(name = "mailboxes", nullable = true, length = 40)
    private String mailboxes;

    @Column(name = "moh_suggest", nullable = true, length = 40)
    private String mohSuggest;

    @Column(name = "outbound_auth", nullable = true, length = 40)
    private String outboundAuth;

    @Column(name = "outbound_proxy", nullable = true, length = 40)
    private String outboundProxy;

    @Column(name = "rewrite_contact", nullable = true, length = 3)
    private String rewriteContact;

    @Column(name = "rtp_ipv6", nullable = true, length = 3)
    private String rtpIpv6;

    @Column(name = "rtp_symmetric", nullable = true, length = 3)
    private String rtpSymmetric;

    @Column(name = "send_diversion", nullable = true, length = 3)
    private String sendDiversion;

    @Column(name = "send_pai", nullable = true, length = 3)
    private String sendPai;

    @Column(name = "send_rpid", nullable = true, length = 3)
    private String sendRpid;

    @Column(name = "timers_min_se", nullable = true, length = 11)
    private Integer timersMinSe;

    @Column(name = "timers", nullable = true, length = 8)
    private Integer timers;

    @Column(name = "timers_sess_expires", nullable = true, length = 11)
    private Integer timersSessExpires;

    @Column(name = "callerid", nullable = true, length = 40)
    private String callerid;

    @Column(name = "callerid_privacy", nullable = true, length = 23)
    private String calleridPrivacy;

    @Column(name = "callerid_tag", nullable = true, length = 40)
    private String calleridTag;

    @Column(name = "100rel", nullable = true, length = 8)
    private String rel100;

    @Column(name = "aggregate_mwi", nullable = true, length = 3)
    private String aggregateMwi;

    @Column(name = "trust_id_inbound", nullable = true, length = 3)
    private String trustIdInbound;

    @Column(name = "trust_id_outbound", nullable = true, length = 3)
    private String trustIdOutbound;

    @Column(name = "use_ptime", nullable = true, length = 3)
    private String usePtime;

    @Column(name = "use_avpf", nullable = true, length = 3)
    private String useAvpf;

    @Column(name = "media_encryption", nullable = true, length = 4)
    private String mediaEncryption;

    @Column(name = "inband_progress", nullable = true, length = 3)
    private String inbandProgress;

    @Column(name = "call_group", nullable = true, length = 40)
    private String callGroup;

    @Column(name = "pickup_group", nullable = true, length = 40)
    private String pickupGroup;

    @Column(name = "named_call_group", nullable = true, length = 40)
    private String namedCallGroup;

    @Column(name = "named_pickup_group", nullable = true, length = 40)
    private String namedPickupGroup;

    @Column(name = "device_state_busy_at", nullable = true, length = 11)
    private Integer deviceStateBusyAt;

    @Column(name = "fax_detect", nullable = true, length = 3)
    private String faxDetect;

    @Column(name = "t38_udptl", nullable = true, length = 3)
    private String t38Udptl;

    @Column(name = "t38_udptl_ec", nullable = true, length = 10)
    private String t38UdptlEc;

    @Column(name = "t38_udptl_maxdatagram", nullable = true, length = 11)
    private Integer t38UdptlMaxdatagram;

    @Column(name = "t38_udptl_nat", nullable = true, length = 3)
    private String t38UdptlNat;

    @Column(name = "t38_udptl_ipv6", nullable = true, length = 3)
    private String t38UdptlIpv6;

    @Column(name = "tone_zone", nullable = true, length = 40)
    private String toneZone;

    @Column(name = "language", nullable = true, length = 40)
    private String language;

    @Column(name = "one_touch_recording", nullable = true, length = 3)
    private String oneTouchRecording;

    @Column(name = "record_on_feature", nullable = true, length = 40)
    private String recordOnFeature;

    @Column(name = "record_off_feature", nullable = true, length = 40)
    private String recordOffFeature;


    @Column(name = "rtp_engine", nullable = true, length = 40)
    private String rtpEngine;

    @Column(name = "allow_transfer", nullable = true, length = 3)
    private String allowTransfer;


    @Column(name = "allow_subscribe", nullable = true, length = 3)
    private String allowSubscribe;

    @Column(name = "sdp_owner", nullable = true, length = 40)
    private String sdpOwner;

    @Column(name = "sdp_session", nullable = true, length = 40)
    private String sdpSession;

    @Column(name = "tos_audio", nullable = true, length = 10)
    private String tosAudio;

    @Column(name = "tos_video", nullable = true, length = 10)
    private String tosVideo;

    @Column(name = "sub_min_expiry", nullable = true, length = 11)
    private String subMinExpiry;

    @Column(name = "mwi_from_user", nullable = true, length = 40)
    private String mwiFromUser;

    @Column(name = "dtls_verify", nullable = true, length = 40)
    private String dtlsVerify;

    @Column(name = "dtls_rekey", nullable = true, length = 40)
    private String dtlsRekey;

    @Column(name = "dtls_cert_file", nullable = true, length = 255)
    private String dtlsCertFile;

    @Column(name = "dtls_private_key", nullable = true, length = 255)
    private String dtlsPrivateKey;

    @Column(name = "dtls_cipher", nullable = true, length = 255)
    private String dtlsCipher;

    @Column(name = "dtls_ca_file", nullable = true, length = 255)
    private String dtlsCaFile;

    @Column(name = "dtls_ca_path", nullable = true, length = 255)
    private String dtlsCaPath;

    @Column(name = "dtls_setup", nullable = true, length = 7)
    private String dtlsSetup;

    @Column(name = "srtp_tag_32", nullable = true, length = 3)
    private String srtpTag32;

    @Column(name = "media_address", nullable = true, length = 40)
    private String mediaAddress;

    @Column(name = "redirect_method", nullable = true, length = 9)
    private String redirectMethod;

    @Column(name = "set_var", nullable = true, length = 255)
    private String setVar;

    @Column(name = "cos_audio", nullable = true, length = 11)
    private Integer cosAudio;

    @Column(name = "cos_video", nullable = true, length = 11)
    private Integer cosVideo;

    @Column(name = "message_context", nullable = true, length = 40)
    private String messageContext;

    @Column(name = "force_avp", nullable = true, length = 3)
    private String forceAvp;

    @Column(name = "media_use_received_transport", nullable = true, length = 3)
    private String mediaUseReceivedTransport;

    @Column(name = "accountcode", nullable = true, length = 40)
    private String accountcode;

    @Column(name = "media_encryption_optimistic", nullable = true, length = 3)
    private String mediaEncryptionOptimistic;

    @Column(name = "user_eq_phone", nullable = true, length = 3)
    private String userEqPhone;

    @Column(name = "rpid_immediate", nullable = true, length = 3)
    private String rpidImmediate;

    @Column(name = "g726_non_standard", nullable = true, length = 3)
    private String g726NonStandard;

    @Column(name = "rtp_keepalive", nullable = true, length = 11)
    private Integer rtpKeepalive;

    @Column(name = "rtp_timeout", nullable = true, length = 11)
    private Integer rtpTimeout;

    @Column(name = "rtp_timeout_hold", nullable = true, length = 11)
    private Integer rtpTimeoutHold;

    @Column(name = "bind_rtp_to_media_address", nullable = true, length = 3)
    private Integer bindRtpToMediaAddress;

    @Column(name = "voicemail_extension", nullable = true, length = 40)
    private String voicemailExtension;

    @Column(name = "mwi_subscribe_replaces_unsolicited", nullable = true, length = 5)
    private String mwiSubscribeReplacesUnsolicited;

    @Column(name = "deny", nullable = true, length = 100)
    private String deny;

    @Column(name = "permit", nullable = true, length = 100)
    private String permit;

    @Column(name = "acl", nullable = true, length = 40)
    private String acl;

    @Column(name = "contact_deny", nullable = true, length = 100)
    private String contactDeny;

    @Column(name = "contact_permit", nullable = true, length = 100)
    private String contactPermit;

    @Column(name = "contact_acl", nullable = true, length = 40)
    private String contactAcl;

    @Column(name = "subscribe_context", nullable = true, length = 40)
    private String subscribeContext;

    @Column(name = "fax_detect_timeout", nullable = true, length = 11)
    private Integer faxDetectTimeout;

    @Column(name = "contact_user", nullable = true, length = 80)
    private String contactUser;

    @Column(name = "asymmetric_rtp_codec", nullable = true, length = 3)
    private String asymmetricRtpCodec;

    @Column(name = "rtcp_mux", nullable = true, length = 3)
    private String rtcpMux;

    @Column(name = "allow_overlap", nullable = true, length = 3)
    private String allowOverlap;

    @Column(name = "refer_blind_progress", nullable = true, length = 3)
    private String referBlindProgress;

    @Column(name = "notify_early_inuse_ringing", nullable = true, length = 3)
    private String notifyEarlyInuseRinging;

    @Column(name = "dtls_fingerprint", nullable = true, length = 7)
    private String dtlsFingerprint;

    @Column(name = "incoming_mwi_mailbox", nullable = true, length = 40)
    private String incomingMwiMailbox;

    @Column(name = "follow_early_media_fork", nullable = true, length = 3)
    private String followEarlyMediaFork;

    @Column(name = "accept_multiple_sdp_answers", nullable = true, length = 3)
    private String acceptMultipleSdpAnswers;

    @Column(name = "suppress_q850_reason_headers", nullable = true, length = 3)
    private String suppressQ850ReasonHeaders;

    @Column(name = "trust_connected_line", nullable = true, length = 5)
    private String trustConnectedLine;

    @Column(name = "send_connected_line", nullable = true, length = 5)
    private String sendConnectedLine;

    @Column(name = "ignore_183_without_sdp", nullable = true, length = 5)
    private String ignore183WithoutSdp;

    @Column(name = "moh_passthrough", nullable = true, length = 3)
    private String mohPassthrough;

    public PsEndPoints() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getAors() {
        return aors;
    }

    public void setAors(String aors) {
        this.aors = aors;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getFromDomain() {
        return fromDomain;
    }

    public void setFromDomain(String fromDomain) {
        this.fromDomain = fromDomain;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getDisallow() {
        return disallow;
    }

    public void setDisallow(String disallow) {
        this.disallow = disallow;
    }

    public String getAllow() {
        return allow;
    }

    public void setAllow(String allow) {
        this.allow = allow;
    }

    public String getDirectMedia() {
        return directMedia;
    }

    public void setDirectMedia(String directMedia) {
        this.directMedia = directMedia;
    }

    public String getConnectedLineMethod() {
        return connectedLineMethod;
    }

    public void setConnectedLineMethod(String connectedLineMethod) {
        this.connectedLineMethod = connectedLineMethod;
    }

    public String getDirectMediaMethod() {
        return directMediaMethod;
    }

    public void setDirectMediaMethod(String directMediaMethod) {
        this.directMediaMethod = directMediaMethod;
    }

    public String getDirectMediaGlareMitigation() {
        return directMediaGlareMitigation;
    }

    public void setDirectMediaGlareMitigation(String directMediaGlareMitigation) {
        this.directMediaGlareMitigation = directMediaGlareMitigation;
    }

    public String getDisableDirectMediaOnNat() {
        return disableDirectMediaOnNat;
    }

    public void setDisableDirectMediaOnNat(String disableDirectMediaOnNat) {
        this.disableDirectMediaOnNat = disableDirectMediaOnNat;
    }

    public String getDtmfMode() {
        return dtmfMode;
    }

    public void setDtmfMode(String dtmfMode) {
        this.dtmfMode = dtmfMode;
    }

    public String getExternalMediaAddress() {
        return externalMediaAddress;
    }

    public void setExternalMediaAddress(String externalMediaAddress) {
        this.externalMediaAddress = externalMediaAddress;
    }

    public String getForceRport() {
        return forceRport;
    }

    public void setForceRport(String forceRport) {
        this.forceRport = forceRport;
    }

    public String getIceSupport() {
        return iceSupport;
    }

    public void setIceSupport(String iceSupport) {
        this.iceSupport = iceSupport;
    }

    public String getIdentifyBy() {
        return identifyBy;
    }

    public void setIdentifyBy(String identifyBy) {
        this.identifyBy = identifyBy;
    }

    public String getMailboxes() {
        return mailboxes;
    }

    public void setMailboxes(String mailboxes) {
        this.mailboxes = mailboxes;
    }

    public String getMohSuggest() {
        return mohSuggest;
    }

    public void setMohSuggest(String mohSuggest) {
        this.mohSuggest = mohSuggest;
    }

    public String getOutboundAuth() {
        return outboundAuth;
    }

    public void setOutboundAuth(String outboundAuth) {
        this.outboundAuth = outboundAuth;
    }

    public String getOutboundProxy() {
        return outboundProxy;
    }

    public void setOutboundProxy(String outboundProxy) {
        this.outboundProxy = outboundProxy;
    }

    public String getRewriteContact() {
        return rewriteContact;
    }

    public void setRewriteContact(String rewriteContact) {
        this.rewriteContact = rewriteContact;
    }

    public String getRtpIpv6() {
        return rtpIpv6;
    }

    public void setRtpIpv6(String rtpIpv6) {
        this.rtpIpv6 = rtpIpv6;
    }

    public String getRtpSymmetric() {
        return rtpSymmetric;
    }

    public void setRtpSymmetric(String rtpSymmetric) {
        this.rtpSymmetric = rtpSymmetric;
    }

    public String getSendDiversion() {
        return sendDiversion;
    }

    public void setSendDiversion(String sendDiversion) {
        this.sendDiversion = sendDiversion;
    }

    public String getSendPai() {
        return sendPai;
    }

    public void setSendPai(String sendPai) {
        this.sendPai = sendPai;
    }

    public String getSendRpid() {
        return sendRpid;
    }

    public void setSendRpid(String sendRpid) {
        this.sendRpid = sendRpid;
    }

    public Integer getTimersMinSe() {
        return timersMinSe;
    }

    public void setTimersMinSe(Integer timersMinSe) {
        this.timersMinSe = timersMinSe;
    }

    public Integer getTimers() {
        return timers;
    }

    public void setTimers(Integer timers) {
        this.timers = timers;
    }

    public Integer getTimersSessExpires() {
        return timersSessExpires;
    }

    public void setTimersSessExpires(Integer timersSessExpires) {
        this.timersSessExpires = timersSessExpires;
    }

    public String getCallerid() {
        return callerid;
    }

    public void setCallerid(String callerid) {
        this.callerid = callerid;
    }

    public String getCalleridPrivacy() {
        return calleridPrivacy;
    }

    public void setCalleridPrivacy(String calleridPrivacy) {
        this.calleridPrivacy = calleridPrivacy;
    }

    public String getCalleridTag() {
        return calleridTag;
    }

    public void setCalleridTag(String calleridTag) {
        this.calleridTag = calleridTag;
    }

    public String getRel100() {
        return rel100;
    }

    public void setRel100(String rel100) {
        this.rel100 = rel100;
    }

    public String getAggregateMwi() {
        return aggregateMwi;
    }

    public void setAggregateMwi(String aggregateMwi) {
        this.aggregateMwi = aggregateMwi;
    }

    public String getTrustIdInbound() {
        return trustIdInbound;
    }

    public void setTrustIdInbound(String trustIdInbound) {
        this.trustIdInbound = trustIdInbound;
    }

    public String getTrustIdOutbound() {
        return trustIdOutbound;
    }

    public void setTrustIdOutbound(String trustIdOutbound) {
        this.trustIdOutbound = trustIdOutbound;
    }

    public String getUsePtime() {
        return usePtime;
    }

    public void setUsePtime(String usePtime) {
        this.usePtime = usePtime;
    }

    public String getUseAvpf() {
        return useAvpf;
    }

    public void setUseAvpf(String useAvpf) {
        this.useAvpf = useAvpf;
    }

    public String getMediaEncryption() {
        return mediaEncryption;
    }

    public void setMediaEncryption(String mediaEncryption) {
        this.mediaEncryption = mediaEncryption;
    }

    public String getInbandProgress() {
        return inbandProgress;
    }

    public void setInbandProgress(String inbandProgress) {
        this.inbandProgress = inbandProgress;
    }

    public String getCallGroup() {
        return callGroup;
    }

    public void setCallGroup(String callGroup) {
        this.callGroup = callGroup;
    }

    public String getPickupGroup() {
        return pickupGroup;
    }

    public void setPickupGroup(String pickupGroup) {
        this.pickupGroup = pickupGroup;
    }

    public String getNamedCallGroup() {
        return namedCallGroup;
    }

    public void setNamedCallGroup(String namedCallGroup) {
        this.namedCallGroup = namedCallGroup;
    }

    public String getNamedPickupGroup() {
        return namedPickupGroup;
    }

    public void setNamedPickupGroup(String namedPickupGroup) {
        this.namedPickupGroup = namedPickupGroup;
    }

    public Integer getDeviceStateBusyAt() {
        return deviceStateBusyAt;
    }

    public void setDeviceStateBusyAt(Integer deviceStateBusyAt) {
        this.deviceStateBusyAt = deviceStateBusyAt;
    }

    public String getFaxDetect() {
        return faxDetect;
    }

    public void setFaxDetect(String faxDetect) {
        this.faxDetect = faxDetect;
    }

    public String getT38Udptl() {
        return t38Udptl;
    }

    public void setT38Udptl(String t38Udptl) {
        this.t38Udptl = t38Udptl;
    }

    public String getT38UdptlEc() {
        return t38UdptlEc;
    }

    public void setT38UdptlEc(String t38UdptlEc) {
        this.t38UdptlEc = t38UdptlEc;
    }

    public Integer getT38UdptlMaxdatagram() {
        return t38UdptlMaxdatagram;
    }

    public void setT38UdptlMaxdatagram(Integer t38UdptlMaxdatagram) {
        this.t38UdptlMaxdatagram = t38UdptlMaxdatagram;
    }

    public String getT38UdptlNat() {
        return t38UdptlNat;
    }

    public void setT38UdptlNat(String t38UdptlNat) {
        this.t38UdptlNat = t38UdptlNat;
    }

    public String getT38UdptlIpv6() {
        return t38UdptlIpv6;
    }

    public void setT38UdptlIpv6(String t38UdptlIpv6) {
        this.t38UdptlIpv6 = t38UdptlIpv6;
    }

    public String getToneZone() {
        return toneZone;
    }

    public void setToneZone(String toneZone) {
        this.toneZone = toneZone;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOneTouchRecording() {
        return oneTouchRecording;
    }

    public void setOneTouchRecording(String oneTouchRecording) {
        this.oneTouchRecording = oneTouchRecording;
    }

    public String getRecordOnFeature() {
        return recordOnFeature;
    }

    public void setRecordOnFeature(String recordOnFeature) {
        this.recordOnFeature = recordOnFeature;
    }

    public String getRecordOffFeature() {
        return recordOffFeature;
    }

    public void setRecordOffFeature(String recordOffFeature) {
        this.recordOffFeature = recordOffFeature;
    }

    public String getRtpEngine() {
        return rtpEngine;
    }

    public void setRtpEngine(String rtpEngine) {
        this.rtpEngine = rtpEngine;
    }

    public String getAllowTransfer() {
        return allowTransfer;
    }

    public void setAllowTransfer(String allowTransfer) {
        this.allowTransfer = allowTransfer;
    }

    public String getAllowSubscribe() {
        return allowSubscribe;
    }

    public void setAllowSubscribe(String allowSubscribe) {
        this.allowSubscribe = allowSubscribe;
    }

    public String getSdpOwner() {
        return sdpOwner;
    }

    public void setSdpOwner(String sdpOwner) {
        this.sdpOwner = sdpOwner;
    }

    public String getSdpSession() {
        return sdpSession;
    }

    public void setSdpSession(String sdpSession) {
        this.sdpSession = sdpSession;
    }

    public String getTosAudio() {
        return tosAudio;
    }

    public void setTosAudio(String tosAudio) {
        this.tosAudio = tosAudio;
    }

    public String getTosVideo() {
        return tosVideo;
    }

    public void setTosVideo(String tosVideo) {
        this.tosVideo = tosVideo;
    }

    public String getSubMinExpiry() {
        return subMinExpiry;
    }

    public void setSubMinExpiry(String subMinExpiry) {
        this.subMinExpiry = subMinExpiry;
    }

    public String getMwiFromUser() {
        return mwiFromUser;
    }

    public void setMwiFromUser(String mwiFromUser) {
        this.mwiFromUser = mwiFromUser;
    }

    public String getDtlsVerify() {
        return dtlsVerify;
    }

    public void setDtlsVerify(String dtlsVerify) {
        this.dtlsVerify = dtlsVerify;
    }

    public String getDtlsRekey() {
        return dtlsRekey;
    }

    public void setDtlsRekey(String dtlsRekey) {
        this.dtlsRekey = dtlsRekey;
    }

    public String getDtlsCertFile() {
        return dtlsCertFile;
    }

    public void setDtlsCertFile(String dtlsCertFile) {
        this.dtlsCertFile = dtlsCertFile;
    }

    public String getDtlsPrivateKey() {
        return dtlsPrivateKey;
    }

    public void setDtlsPrivateKey(String dtlsPrivateKey) {
        this.dtlsPrivateKey = dtlsPrivateKey;
    }

    public String getDtlsCipher() {
        return dtlsCipher;
    }

    public void setDtlsCipher(String dtlsCipher) {
        this.dtlsCipher = dtlsCipher;
    }

    public String getDtlsCaFile() {
        return dtlsCaFile;
    }

    public void setDtlsCaFile(String dtlsCaFile) {
        this.dtlsCaFile = dtlsCaFile;
    }

    public String getDtlsCaPath() {
        return dtlsCaPath;
    }

    public void setDtlsCaPath(String dtlsCaPath) {
        this.dtlsCaPath = dtlsCaPath;
    }

    public String getDtlsSetup() {
        return dtlsSetup;
    }

    public void setDtlsSetup(String dtlsSetup) {
        this.dtlsSetup = dtlsSetup;
    }

    public String getSrtpTag32() {
        return srtpTag32;
    }

    public void setSrtpTag32(String srtpTag32) {
        this.srtpTag32 = srtpTag32;
    }

    public String getMediaAddress() {
        return mediaAddress;
    }

    public void setMediaAddress(String mediaAddress) {
        this.mediaAddress = mediaAddress;
    }

    public String getRedirectMethod() {
        return redirectMethod;
    }

    public void setRedirectMethod(String redirectMethod) {
        this.redirectMethod = redirectMethod;
    }

    public String getSetVar() {
        return setVar;
    }

    public void setSetVar(String setVar) {
        this.setVar = setVar;
    }

    public Integer getCosAudio() {
        return cosAudio;
    }

    public void setCosAudio(Integer cosAudio) {
        this.cosAudio = cosAudio;
    }

    public Integer getCosVideo() {
        return cosVideo;
    }

    public void setCosVideo(Integer cosVideo) {
        this.cosVideo = cosVideo;
    }

    public String getMessageContext() {
        return messageContext;
    }

    public void setMessageContext(String messageContext) {
        this.messageContext = messageContext;
    }

    public String getForceAvp() {
        return forceAvp;
    }

    public void setForceAvp(String forceAvp) {
        this.forceAvp = forceAvp;
    }

    public String getMediaUseReceivedTransport() {
        return mediaUseReceivedTransport;
    }

    public void setMediaUseReceivedTransport(String mediaUseReceivedTransport) {
        this.mediaUseReceivedTransport = mediaUseReceivedTransport;
    }

    public String getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode;
    }

    public String getMediaEncryptionOptimistic() {
        return mediaEncryptionOptimistic;
    }

    public void setMediaEncryptionOptimistic(String mediaEncryptionOptimistic) {
        this.mediaEncryptionOptimistic = mediaEncryptionOptimistic;
    }

    public String getUserEqPhone() {
        return userEqPhone;
    }

    public void setUserEqPhone(String userEqPhone) {
        this.userEqPhone = userEqPhone;
    }

    public String getRpidImmediate() {
        return rpidImmediate;
    }

    public void setRpidImmediate(String rpidImmediate) {
        this.rpidImmediate = rpidImmediate;
    }

    public String getG726NonStandard() {
        return g726NonStandard;
    }

    public void setG726NonStandard(String g726NonStandard) {
        this.g726NonStandard = g726NonStandard;
    }

    public Integer getRtpKeepalive() {
        return rtpKeepalive;
    }

    public void setRtpKeepalive(Integer rtpKeepalive) {
        this.rtpKeepalive = rtpKeepalive;
    }

    public Integer getRtpTimeout() {
        return rtpTimeout;
    }

    public void setRtpTimeout(Integer rtpTimeout) {
        this.rtpTimeout = rtpTimeout;
    }

    public Integer getRtpTimeoutHold() {
        return rtpTimeoutHold;
    }

    public void setRtpTimeoutHold(Integer rtpTimeoutHold) {
        this.rtpTimeoutHold = rtpTimeoutHold;
    }

    public Integer getBindRtpToMediaAddress() {
        return bindRtpToMediaAddress;
    }

    public void setBindRtpToMediaAddress(Integer bindRtpToMediaAddress) {
        this.bindRtpToMediaAddress = bindRtpToMediaAddress;
    }

    public String getVoicemailExtension() {
        return voicemailExtension;
    }

    public void setVoicemailExtension(String voicemailExtension) {
        this.voicemailExtension = voicemailExtension;
    }

    public String getMwiSubscribeReplacesUnsolicited() {
        return mwiSubscribeReplacesUnsolicited;
    }

    public void setMwiSubscribeReplacesUnsolicited(String mwiSubscribeReplacesUnsolicited) {
        this.mwiSubscribeReplacesUnsolicited = mwiSubscribeReplacesUnsolicited;
    }

    public String getDeny() {
        return deny;
    }

    public void setDeny(String deny) {
        this.deny = deny;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getAcl() {
        return acl;
    }

    public void setAcl(String acl) {
        this.acl = acl;
    }

    public String getContactDeny() {
        return contactDeny;
    }

    public void setContactDeny(String contactDeny) {
        this.contactDeny = contactDeny;
    }

    public String getContactPermit() {
        return contactPermit;
    }

    public void setContactPermit(String contactPermit) {
        this.contactPermit = contactPermit;
    }

    public String getContactAcl() {
        return contactAcl;
    }

    public void setContactAcl(String contactAcl) {
        this.contactAcl = contactAcl;
    }

    public String getSubscribeContext() {
        return subscribeContext;
    }

    public void setSubscribeContext(String subscribeContext) {
        this.subscribeContext = subscribeContext;
    }

    public Integer getFaxDetectTimeout() {
        return faxDetectTimeout;
    }

    public void setFaxDetectTimeout(Integer faxDetectTimeout) {
        this.faxDetectTimeout = faxDetectTimeout;
    }

    public String getContactUser() {
        return contactUser;
    }

    public void setContactUser(String contactUser) {
        this.contactUser = contactUser;
    }

    public String getAsymmetricRtpCodec() {
        return asymmetricRtpCodec;
    }

    public void setAsymmetricRtpCodec(String asymmetricRtpCodec) {
        this.asymmetricRtpCodec = asymmetricRtpCodec;
    }

    public String getRtcpMux() {
        return rtcpMux;
    }

    public void setRtcpMux(String rtcpMux) {
        this.rtcpMux = rtcpMux;
    }

    public String getAllowOverlap() {
        return allowOverlap;
    }

    public void setAllowOverlap(String allowOverlap) {
        this.allowOverlap = allowOverlap;
    }

    public String getReferBlindProgress() {
        return referBlindProgress;
    }

    public void setReferBlindProgress(String referBlindProgress) {
        this.referBlindProgress = referBlindProgress;
    }

    public String getNotifyEarlyInuseRinging() {
        return notifyEarlyInuseRinging;
    }

    public void setNotifyEarlyInuseRinging(String notifyEarlyInuseRinging) {
        this.notifyEarlyInuseRinging = notifyEarlyInuseRinging;
    }

    public String getDtlsFingerprint() {
        return dtlsFingerprint;
    }

    public void setDtlsFingerprint(String dtlsFingerprint) {
        this.dtlsFingerprint = dtlsFingerprint;
    }

    public String getIncomingMwiMailbox() {
        return incomingMwiMailbox;
    }

    public void setIncomingMwiMailbox(String incomingMwiMailbox) {
        this.incomingMwiMailbox = incomingMwiMailbox;
    }

    public String getFollowEarlyMediaFork() {
        return followEarlyMediaFork;
    }

    public void setFollowEarlyMediaFork(String followEarlyMediaFork) {
        this.followEarlyMediaFork = followEarlyMediaFork;
    }

    public String getAcceptMultipleSdpAnswers() {
        return acceptMultipleSdpAnswers;
    }

    public void setAcceptMultipleSdpAnswers(String acceptMultipleSdpAnswers) {
        this.acceptMultipleSdpAnswers = acceptMultipleSdpAnswers;
    }

    public String getSuppressQ850ReasonHeaders() {
        return suppressQ850ReasonHeaders;
    }

    public void setSuppressQ850ReasonHeaders(String suppressQ850ReasonHeaders) {
        this.suppressQ850ReasonHeaders = suppressQ850ReasonHeaders;
    }

    public String getTrustConnectedLine() {
        return trustConnectedLine;
    }

    public void setTrustConnectedLine(String trustConnectedLine) {
        this.trustConnectedLine = trustConnectedLine;
    }

    public String getSendConnectedLine() {
        return sendConnectedLine;
    }

    public void setSendConnectedLine(String sendConnectedLine) {
        this.sendConnectedLine = sendConnectedLine;
    }

    public String getIgnore183WithoutSdp() {
        return ignore183WithoutSdp;
    }

    public void setIgnore183WithoutSdp(String ignore183WithoutSdp) {
        this.ignore183WithoutSdp = ignore183WithoutSdp;
    }

    public String getMohPassthrough() {
        return mohPassthrough;
    }

    public void setMohPassthrough(String mohPassthrough) {
        this.mohPassthrough = mohPassthrough;
    }
}