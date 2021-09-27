package com.finance.exchangerateservice.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Eyüp Akay
 */
@Entity
@Table(name = "exchange_rate")
@ToString
public class ExchangeRate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exchange_rate_id", nullable = false, updatable = false, unique = true)
    private Long exchangeRateId;

    @Column(name = "timestamp", nullable = false, updatable = false)
    private Integer timestamp;

    @Column(name = "base_currency", nullable = false, updatable = false)
    private String baseCurrency;

    @Column(name = "create_date", nullable = false, updatable = false)
    private LocalDate date;

//    @PrePersist
//    void onPrePersist() {
//        this.date = LocalDate.now();
//    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @JsonProperty("AED")
    @Column
    private Double aed;
    @JsonProperty("AFN")
    @Column
    private Double afn;
    @JsonProperty("ALL")
    @Column(name = "_all")
    private Double all;
    @JsonProperty("AMD")
    @Column
    private Double amd;
    @JsonProperty("ANG")
    @Column
    private Double ang;
    @JsonProperty("AOA")
    @Column
    private Double aoa;
    @JsonProperty("ARS")
    @Column
    private Double ars;
    @JsonProperty("AUD")
    @Column
    private Double aud;
    @JsonProperty("AWG")
    @Column
    private Double awg;
    @JsonProperty("AZN")
    @Column
    private Double azn;
    @JsonProperty("BAM")
    @Column
    private Double bam;
    @JsonProperty("BBD")
    @Column
    private Double bbd;
    @JsonProperty("BDT")
    @Column
    private Double bdt;
    @JsonProperty("BGN")
    @Column
    private Double bgn;
    @JsonProperty("BHD")
    @Column
    private Double bhd;
    @JsonProperty("BIF")
    @Column
    private Double bif;
    @JsonProperty("BMD")
    @Column
    private Double bmd;
    @JsonProperty("BND")
    @Column
    private Double bnd;
    @JsonProperty("BOB")
    @Column
    private Double bob;
    @JsonProperty("BRL")
    @Column
    private Double brl;
    @JsonProperty("BSD")
    @Column
    private Double bsd;
    @JsonProperty("BTC")
    @Column
    private Double btc;
    @JsonProperty("BTN")
    @Column
    private Double btn;
    @JsonProperty("BWP")
    @Column
    private Double bwp;
    @JsonProperty("BYN")
    @Column
    private Double byn;
    @JsonProperty("BYR")
    @Column
    private Double byr;
    @JsonProperty("BZD")
    @Column
    private Double bzd;
    @JsonProperty("CAD")
    @Column
    private Double cad;
    @JsonProperty("CDF")
    @Column
    private Double cdf;
    @JsonProperty("CHF")
    @Column
    private Double chf;
    @JsonProperty("CLF")
    @Column
    private Double clf;
    @JsonProperty("CLP")
    @Column
    private Double clp;
    @JsonProperty("CNY")
    @Column
    private Double cny;
    @JsonProperty("COP")
    @Column
    private Double cop;
    @JsonProperty("CRC")
    @Column
    private Double crc;
    @JsonProperty("CUC")
    @Column
    private Double cuc;
    @JsonProperty("CUP")
    @Column
    private Double cup;
    @JsonProperty("CVE")
    @Column
    private Double cve;
    @JsonProperty("CZK")
    @Column
    private Double czk;
    @JsonProperty("DJF")
    @Column
    private Double djf;
    @JsonProperty("DKK")
    @Column
    private Double dkk;
    @JsonProperty("DOP")
    @Column
    private Double dop;
    @JsonProperty("DZD")
    @Column
    private Double dzd;
    @JsonProperty("EGP")
    @Column
    private Double egp;
    @JsonProperty("ERN")
    @Column
    private Double ern;
    @JsonProperty("ETB")
    @Column
    private Double etb;
    @JsonProperty("EUR")
    @Column
    private Double eur;
    @JsonProperty("FJD")
    @Column
    private Double fjd;
    @JsonProperty("FKP")
    @Column
    private Double fkp;
    @JsonProperty("GBP")
    @Column
    private Double gbp;
    @JsonProperty("GEL")
    @Column
    private Double gel;
    @JsonProperty("GGP")
    @Column
    private Double ggp;
    @JsonProperty("GHS")
    @Column
    private Double ghs;
    @JsonProperty("GIP")
    @Column
    private Double gip;
    @JsonProperty("GMD")
    @Column
    private Double gmd;
    @JsonProperty("GNF")
    @Column
    private Double gnf;
    @JsonProperty("GTQ")
    @Column
    private Double gtq;
    @JsonProperty("GYD")
    @Column
    private Double gyd;
    @JsonProperty("HKD")
    @Column
    private Double hkd;
    @JsonProperty("HNL")
    @Column
    private Double hnl;
    @JsonProperty("HRK")
    @Column
    private Double hrk;
    @JsonProperty("HTG")
    @Column
    private Double htg;
    @JsonProperty("HUF")
    @Column
    private Double huf;
    @JsonProperty("IDR")
    @Column
    private Double idr;
    @JsonProperty("ILS")
    @Column
    private Double ils;
    @JsonProperty("IMP")
    @Column
    private Double imp;
    @JsonProperty("INR")
    @Column
    private Double inr;
    @JsonProperty("IQD")
    @Column
    private Double iqd;
    @JsonProperty("IRR")
    @Column
    private Double irr;
    @JsonProperty("ISK")
    @Column
    private Double isk;
    @JsonProperty("JEP")
    @Column
    private Double jep;
    @JsonProperty("JMD")
    @Column
    private Double jmd;
    @JsonProperty("JOD")
    @Column
    private Double jod;
    @JsonProperty("JPY")
    @Column
    private Double jpy;
    @JsonProperty("KES")
    @Column
    private Double kes;
    @JsonProperty("KGS")
    @Column
    private Double kgs;
    @JsonProperty("KHR")
    @Column
    private Double khr;
    @JsonProperty("KMF")
    @Column
    private Double kmf;
    @JsonProperty("KPW")
    @Column
    private Double kpw;
    @JsonProperty("KRW")
    @Column
    private Double krw;
    @JsonProperty("KWD")
    @Column
    private Double kwd;
    @JsonProperty("KYD")
    @Column
    private Double kyd;
    @JsonProperty("KZT")
    @Column
    private Double kzt;
    @JsonProperty("LAK")
    @Column
    private Double lak;
    @JsonProperty("LBP")
    @Column
    private Double lbp;
    @JsonProperty("LKR")
    @Column
    private Double lkr;
    @JsonProperty("LRD")
    @Column
    private Double lrd;
    @JsonProperty("LSL")
    @Column
    private Double lsl;
    @JsonProperty("LTL")
    @Column
    private Double ltl;
    @JsonProperty("LVL")
    @Column
    private Double lvl;
    @JsonProperty("LYD")
    @Column
    private Double lyd;
    @JsonProperty("MAD")
    @Column
    private Double mad;
    @JsonProperty("MDL")
    @Column
    private Double mdl;
    @JsonProperty("MGA")
    @Column
    private Double mga;
    @JsonProperty("MKD")
    @Column
    private Double mkd;
    @JsonProperty("MMK")
    @Column
    private Double mmk;
    @JsonProperty("MNT")
    @Column
    private Double mnt;
    @JsonProperty("MOP")
    @Column
    private Double mop;
    @JsonProperty("MRO")
    @Column
    private Double mro;
    @JsonProperty("MUR")
    @Column
    private Double mur;
    @JsonProperty("MVR")
    @Column
    private Double mvr;
    @JsonProperty("MWK")
    @Column
    private Double mwk;
    @JsonProperty("MXN")
    @Column
    private Double mxn;
    @JsonProperty("MYR")
    @Column
    private Double myr;
    @JsonProperty("MZN")
    @Column
    private Double mzn;
    @JsonProperty("NAD")
    @Column
    private Double nad;
    @JsonProperty("NGN")
    @Column
    private Double ngn;
    @JsonProperty("NIO")
    @Column
    private Double nio;
    @JsonProperty("NOK")
    @Column
    private Double nok;
    @JsonProperty("NPR")
    @Column
    private Double npr;
    @JsonProperty("NZD")
    @Column
    private Double nzd;
    @JsonProperty("OMR")
    @Column
    private Double omr;
    @JsonProperty("PAB")
    @Column
    private Double pab;
    @JsonProperty("PEN")
    @Column
    private Double pen;
    @JsonProperty("PGK")
    @Column
    private Double pgk;
    @JsonProperty("PHP")
    @Column
    private Double php;
    @JsonProperty("PKR")
    @Column
    private Double pkr;
    @JsonProperty("PLN")
    @Column
    private Double pln;
    @JsonProperty("PYG")
    @Column
    private Double pyg;
    @JsonProperty("QAR")
    @Column
    private Double qar;
    @JsonProperty("RON")
    @Column
    private Double ron;
    @JsonProperty("RSD")
    @Column
    private Double rsd;
    @JsonProperty("RUB")
    @Column
    private Double rub;
    @JsonProperty("RWF")
    @Column
    private Double rwf;
    @JsonProperty("SAR")
    @Column
    private Double sar;
    @JsonProperty("SBD")
    @Column
    private Double sbd;
    @JsonProperty("SCR")
    @Column
    private Double scr;
    @JsonProperty("SDG")
    @Column
    private Double sdg;
    @JsonProperty("SEK")
    @Column
    private Double sek;
    @JsonProperty("SGD")
    @Column
    private Double sgd;
    @JsonProperty("SHP")
    @Column
    private Double shp;
    @JsonProperty("SLL")
    @Column
    private Double sll;
    @JsonProperty("SOS")
    @Column
    private Double sos;
    @JsonProperty("SRD")
    @Column
    private Double srd;
    @JsonProperty("STD")
    @Column
    private Double std;
    @JsonProperty("SVC")
    @Column
    private Double svc;
    @JsonProperty("SYP")
    @Column
    private Double syp;
    @JsonProperty("SZL")
    @Column
    private Double szl;
    @JsonProperty("THB")
    @Column
    private Double thb;
    @JsonProperty("TJS")
    @Column
    private Double tjs;
    @JsonProperty("TMT")
    @Column
    private Double tmt;
    @JsonProperty("TND")
    @Column
    private Double tnd;
    @JsonProperty("TOP")
    @Column
    private Double top;
    @JsonProperty("TRY")
    @Column(name = "try")
    private Double _try;
    @JsonProperty("TTD")
    @Column
    private Double ttd;
    @JsonProperty("TWD")
    @Column
    private Double twd;
    @JsonProperty("TZS")
    @Column
    private Double tzs;
    @JsonProperty("UAH")
    @Column
    private Double uah;
    @JsonProperty("UGX")
    @Column
    private Double ugx;
    @JsonProperty("USD")
    @Column
    private Double usd;
    @JsonProperty("UYU")
    @Column
    private Double uyu;
    @JsonProperty("UZS")
    @Column
    private Double uzs;
    @JsonProperty("VEF")
    @Column
    private Double vef;
    @JsonProperty("VND")
    @Column
    private Double vnd;
    @JsonProperty("VUV")
    @Column
    private Double vuv;
    @JsonProperty("WST")
    @Column
    private Double wst;
    @JsonProperty("XAF")
    @Column
    private Double xaf;
    @JsonProperty("XAG")
    @Column
    private Double xag;
    @JsonProperty("XAU")
    @Column
    private Double xau;
    @JsonProperty("XCD")
    @Column
    private Double xcd;
    @JsonProperty("XDR")
    @Column
    private Double xdr;
    @JsonProperty("XOF")
    @Column
    private Double xof;
    @JsonProperty("XPF")
    @Column
    private Double xpf;
    @JsonProperty("YER")
    @Column
    private Double yer;
    @JsonProperty("ZAR")
    @Column
    private Double zar;
    @JsonProperty("ZMK")
    @Column
    private Double zmk;
    @JsonProperty("ZMW")
    @Column
    private Double zmw;
    @JsonProperty("ZWL")
    @Column
    private Double zwl;


    public Double getAed() {
        return aed;
    }

    public void setAed(Double aed) {
        this.aed = aed;
    }

    public Double getAfn() {
        return afn;
    }

    public void setAfn(Double afn) {
        this.afn = afn;
    }

    public Double getAll() {
        return all;
    }

    public void setAll(Double all) {
        this.all = all;
    }

    public Double getAmd() {
        return amd;
    }

    public void setAmd(Double amd) {
        this.amd = amd;
    }

    public Double getAng() {
        return ang;
    }

    public void setAng(Double ang) {
        this.ang = ang;
    }

    public Double getAoa() {
        return aoa;
    }

    public void setAoa(Double aoa) {
        this.aoa = aoa;
    }

    public Double getArs() {
        return ars;
    }

    public void setArs(Double ars) {
        this.ars = ars;
    }

    public Double getAud() {
        return aud;
    }

    public void setAud(Double aud) {
        this.aud = aud;
    }

    public Double getAwg() {
        return awg;
    }

    public void setAwg(Double awg) {
        this.awg = awg;
    }

    public Double getAzn() {
        return azn;
    }

    public void setAzn(Double azn) {
        this.azn = azn;
    }

    public Double getBam() {
        return bam;
    }

    public void setBam(Double bam) {
        this.bam = bam;
    }

    public Double getBbd() {
        return bbd;
    }

    public void setBbd(Double bbd) {
        this.bbd = bbd;
    }

    public Double getBdt() {
        return bdt;
    }

    public void setBdt(Double bdt) {
        this.bdt = bdt;
    }

    public Double getBgn() {
        return bgn;
    }

    public void setBgn(Double bgn) {
        this.bgn = bgn;
    }

    public Double getBhd() {
        return bhd;
    }

    public void setBhd(Double bhd) {
        this.bhd = bhd;
    }

    public Double getBif() {
        return bif;
    }

    public void setBif(Double bif) {
        this.bif = bif;
    }

    public Double getBmd() {
        return bmd;
    }

    public void setBmd(Double bmd) {
        this.bmd = bmd;
    }

    public Double getBnd() {
        return bnd;
    }

    public void setBnd(Double bnd) {
        this.bnd = bnd;
    }

    public Double getBob() {
        return bob;
    }

    public void setBob(Double bob) {
        this.bob = bob;
    }

    public Double getBrl() {
        return brl;
    }

    public void setBrl(Double brl) {
        this.brl = brl;
    }

    public Double getBsd() {
        return bsd;
    }

    public void setBsd(Double bsd) {
        this.bsd = bsd;
    }

    public Double getBtc() {
        return btc;
    }

    public void setBtc(Double btc) {
        this.btc = btc;
    }

    public Double getBtn() {
        return btn;
    }

    public void setBtn(Double btn) {
        this.btn = btn;
    }

    public Double getBwp() {
        return bwp;
    }

    public void setBwp(Double bwp) {
        this.bwp = bwp;
    }

    public Double getByn() {
        return byn;
    }

    public void setByn(Double byn) {
        this.byn = byn;
    }

    public Double getByr() {
        return byr;
    }

    public void setByr(Double byr) {
        this.byr = byr;
    }

    public Double getBzd() {
        return bzd;
    }

    public void setBzd(Double bzd) {
        this.bzd = bzd;
    }

    public Double getCad() {
        return cad;
    }

    public void setCad(Double cad) {
        this.cad = cad;
    }

    public Double getCdf() {
        return cdf;
    }

    public void setCdf(Double cdf) {
        this.cdf = cdf;
    }

    public Double getChf() {
        return chf;
    }

    public void setChf(Double chf) {
        this.chf = chf;
    }

    public Double getClf() {
        return clf;
    }

    public void setClf(Double clf) {
        this.clf = clf;
    }

    public Double getClp() {
        return clp;
    }

    public void setClp(Double clp) {
        this.clp = clp;
    }

    public Double getCny() {
        return cny;
    }

    public void setCny(Double cny) {
        this.cny = cny;
    }

    public Double getCop() {
        return cop;
    }

    public void setCop(Double cop) {
        this.cop = cop;
    }

    public Double getCrc() {
        return crc;
    }

    public void setCrc(Double crc) {
        this.crc = crc;
    }

    public Double getCuc() {
        return cuc;
    }

    public void setCuc(Double cuc) {
        this.cuc = cuc;
    }

    public Double getCup() {
        return cup;
    }

    public void setCup(Double cup) {
        this.cup = cup;
    }

    public Double getCve() {
        return cve;
    }

    public void setCve(Double cve) {
        this.cve = cve;
    }

    public Double getCzk() {
        return czk;
    }

    public void setCzk(Double czk) {
        this.czk = czk;
    }

    public Double getDjf() {
        return djf;
    }

    public void setDjf(Double djf) {
        this.djf = djf;
    }

    public Double getDkk() {
        return dkk;
    }

    public void setDkk(Double dkk) {
        this.dkk = dkk;
    }

    public Double getDop() {
        return dop;
    }

    public void setDop(Double dop) {
        this.dop = dop;
    }

    public Double getDzd() {
        return dzd;
    }

    public void setDzd(Double dzd) {
        this.dzd = dzd;
    }

    public Double getEgp() {
        return egp;
    }

    public void setEgp(Double egp) {
        this.egp = egp;
    }

    public Double getErn() {
        return ern;
    }

    public void setErn(Double ern) {
        this.ern = ern;
    }

    public Double getEtb() {
        return etb;
    }

    public void setEtb(Double etb) {
        this.etb = etb;
    }

    public Double getEur() {
        return eur;
    }

    public void setEur(Double eur) {
        this.eur = eur;
    }

    public Double getFjd() {
        return fjd;
    }

    public void setFjd(Double fjd) {
        this.fjd = fjd;
    }

    public Double getFkp() {
        return fkp;
    }

    public void setFkp(Double fkp) {
        this.fkp = fkp;
    }

    public Double getGbp() {
        return gbp;
    }

    public void setGbp(Double gbp) {
        this.gbp = gbp;
    }

    public Double getGel() {
        return gel;
    }

    public void setGel(Double gel) {
        this.gel = gel;
    }

    public Double getGgp() {
        return ggp;
    }

    public void setGgp(Double ggp) {
        this.ggp = ggp;
    }

    public Double getGhs() {
        return ghs;
    }

    public void setGhs(Double ghs) {
        this.ghs = ghs;
    }

    public Double getGip() {
        return gip;
    }

    public void setGip(Double gip) {
        this.gip = gip;
    }

    public Double getGmd() {
        return gmd;
    }

    public void setGmd(Double gmd) {
        this.gmd = gmd;
    }

    public Double getGnf() {
        return gnf;
    }

    public void setGnf(Double gnf) {
        this.gnf = gnf;
    }

    public Double getGtq() {
        return gtq;
    }

    public void setGtq(Double gtq) {
        this.gtq = gtq;
    }

    public Double getGyd() {
        return gyd;
    }

    public void setGyd(Double gyd) {
        this.gyd = gyd;
    }

    public Double getHkd() {
        return hkd;
    }

    public void setHkd(Double hkd) {
        this.hkd = hkd;
    }

    public Double getHnl() {
        return hnl;
    }

    public void setHnl(Double hnl) {
        this.hnl = hnl;
    }

    public Double getHrk() {
        return hrk;
    }

    public void setHrk(Double hrk) {
        this.hrk = hrk;
    }

    public Double getHtg() {
        return htg;
    }

    public void setHtg(Double htg) {
        this.htg = htg;
    }

    public Double getHuf() {
        return huf;
    }

    public void setHuf(Double huf) {
        this.huf = huf;
    }

    public Double getIdr() {
        return idr;
    }

    public void setIdr(Double idr) {
        this.idr = idr;
    }

    public Double getIls() {
        return ils;
    }

    public void setIls(Double ils) {
        this.ils = ils;
    }

    public Double getImp() {
        return imp;
    }

    public void setImp(Double imp) {
        this.imp = imp;
    }

    public Double getInr() {
        return inr;
    }

    public void setInr(Double inr) {
        this.inr = inr;
    }

    public Double getIqd() {
        return iqd;
    }

    public void setIqd(Double iqd) {
        this.iqd = iqd;
    }

    public Double getIrr() {
        return irr;
    }

    public void setIrr(Double irr) {
        this.irr = irr;
    }

    public Double getIsk() {
        return isk;
    }

    public void setIsk(Double isk) {
        this.isk = isk;
    }

    public Double getJep() {
        return jep;
    }

    public void setJep(Double jep) {
        this.jep = jep;
    }

    public Double getJmd() {
        return jmd;
    }

    public void setJmd(Double jmd) {
        this.jmd = jmd;
    }

    public Double getJod() {
        return jod;
    }

    public void setJod(Double jod) {
        this.jod = jod;
    }

    public Double getJpy() {
        return jpy;
    }

    public void setJpy(Double jpy) {
        this.jpy = jpy;
    }

    public Double getKes() {
        return kes;
    }

    public void setKes(Double kes) {
        this.kes = kes;
    }

    public Double getKgs() {
        return kgs;
    }

    public void setKgs(Double kgs) {
        this.kgs = kgs;
    }

    public Double getKhr() {
        return khr;
    }

    public void setKhr(Double khr) {
        this.khr = khr;
    }

    public Double getKmf() {
        return kmf;
    }

    public void setKmf(Double kmf) {
        this.kmf = kmf;
    }

    public Double getKpw() {
        return kpw;
    }

    public void setKpw(Double kpw) {
        this.kpw = kpw;
    }

    public Double getKrw() {
        return krw;
    }

    public void setKrw(Double krw) {
        this.krw = krw;
    }

    public Double getKwd() {
        return kwd;
    }

    public void setKwd(Double kwd) {
        this.kwd = kwd;
    }

    public Double getKyd() {
        return kyd;
    }

    public void setKyd(Double kyd) {
        this.kyd = kyd;
    }

    public Double getKzt() {
        return kzt;
    }

    public void setKzt(Double kzt) {
        this.kzt = kzt;
    }

    public Double getLak() {
        return lak;
    }

    public void setLak(Double lak) {
        this.lak = lak;
    }

    public Double getLbp() {
        return lbp;
    }

    public void setLbp(Double lbp) {
        this.lbp = lbp;
    }

    public Double getLkr() {
        return lkr;
    }

    public void setLkr(Double lkr) {
        this.lkr = lkr;
    }

    public Double getLrd() {
        return lrd;
    }

    public void setLrd(Double lrd) {
        this.lrd = lrd;
    }

    public Double getLsl() {
        return lsl;
    }

    public void setLsl(Double lsl) {
        this.lsl = lsl;
    }

    public Double getLtl() {
        return ltl;
    }

    public void setLtl(Double ltl) {
        this.ltl = ltl;
    }

    public Double getLvl() {
        return lvl;
    }

    public void setLvl(Double lvl) {
        this.lvl = lvl;
    }

    public Double getLyd() {
        return lyd;
    }

    public void setLyd(Double lyd) {
        this.lyd = lyd;
    }

    public Double getMad() {
        return mad;
    }

    public void setMad(Double mad) {
        this.mad = mad;
    }

    public Double getMdl() {
        return mdl;
    }

    public void setMdl(Double mdl) {
        this.mdl = mdl;
    }

    public Double getMga() {
        return mga;
    }

    public void setMga(Double mga) {
        this.mga = mga;
    }

    public Double getMkd() {
        return mkd;
    }

    public void setMkd(Double mkd) {
        this.mkd = mkd;
    }

    public Double getMmk() {
        return mmk;
    }

    public void setMmk(Double mmk) {
        this.mmk = mmk;
    }

    public Double getMnt() {
        return mnt;
    }

    public void setMnt(Double mnt) {
        this.mnt = mnt;
    }

    public Double getMop() {
        return mop;
    }

    public void setMop(Double mop) {
        this.mop = mop;
    }

    public Double getMro() {
        return mro;
    }

    public void setMro(Double mro) {
        this.mro = mro;
    }

    public Double getMur() {
        return mur;
    }

    public void setMur(Double mur) {
        this.mur = mur;
    }

    public Double getMvr() {
        return mvr;
    }

    public void setMvr(Double mvr) {
        this.mvr = mvr;
    }

    public Double getMwk() {
        return mwk;
    }

    public void setMwk(Double mwk) {
        this.mwk = mwk;
    }

    public Double getMxn() {
        return mxn;
    }

    public void setMxn(Double mxn) {
        this.mxn = mxn;
    }

    public Double getMyr() {
        return myr;
    }

    public void setMyr(Double myr) {
        this.myr = myr;
    }

    public Double getMzn() {
        return mzn;
    }

    public void setMzn(Double mzn) {
        this.mzn = mzn;
    }

    public Double getNad() {
        return nad;
    }

    public void setNad(Double nad) {
        this.nad = nad;
    }

    public Double getNgn() {
        return ngn;
    }

    public void setNgn(Double ngn) {
        this.ngn = ngn;
    }

    public Double getNio() {
        return nio;
    }

    public void setNio(Double nio) {
        this.nio = nio;
    }

    public Double getNok() {
        return nok;
    }

    public void setNok(Double nok) {
        this.nok = nok;
    }

    public Double getNpr() {
        return npr;
    }

    public void setNpr(Double npr) {
        this.npr = npr;
    }

    public Double getNzd() {
        return nzd;
    }

    public void setNzd(Double nzd) {
        this.nzd = nzd;
    }

    public Double getOmr() {
        return omr;
    }

    public void setOmr(Double omr) {
        this.omr = omr;
    }

    public Double getPab() {
        return pab;
    }

    public void setPab(Double pab) {
        this.pab = pab;
    }

    public Double getPen() {
        return pen;
    }

    public void setPen(Double pen) {
        this.pen = pen;
    }

    public Double getPgk() {
        return pgk;
    }

    public void setPgk(Double pgk) {
        this.pgk = pgk;
    }

    public Double getPhp() {
        return php;
    }

    public void setPhp(Double php) {
        this.php = php;
    }

    public Double getPkr() {
        return pkr;
    }

    public void setPkr(Double pkr) {
        this.pkr = pkr;
    }

    public Double getPln() {
        return pln;
    }

    public void setPln(Double pln) {
        this.pln = pln;
    }

    public Double getPyg() {
        return pyg;
    }

    public void setPyg(Double pyg) {
        this.pyg = pyg;
    }

    public Double getQar() {
        return qar;
    }

    public void setQar(Double qar) {
        this.qar = qar;
    }

    public Double getRon() {
        return ron;
    }

    public void setRon(Double ron) {
        this.ron = ron;
    }

    public Double getRsd() {
        return rsd;
    }

    public void setRsd(Double rsd) {
        this.rsd = rsd;
    }

    public Double getRub() {
        return rub;
    }

    public void setRub(Double rub) {
        this.rub = rub;
    }

    public Double getRwf() {
        return rwf;
    }

    public void setRwf(Double rwf) {
        this.rwf = rwf;
    }

    public Double getSar() {
        return sar;
    }

    public void setSar(Double sar) {
        this.sar = sar;
    }

    public Double getSbd() {
        return sbd;
    }

    public void setSbd(Double sbd) {
        this.sbd = sbd;
    }

    public Double getScr() {
        return scr;
    }

    public void setScr(Double scr) {
        this.scr = scr;
    }

    public Double getSdg() {
        return sdg;
    }

    public void setSdg(Double sdg) {
        this.sdg = sdg;
    }

    public Double getSek() {
        return sek;
    }

    public void setSek(Double sek) {
        this.sek = sek;
    }

    public Double getSgd() {
        return sgd;
    }

    public void setSgd(Double sgd) {
        this.sgd = sgd;
    }

    public Double getShp() {
        return shp;
    }

    public void setShp(Double shp) {
        this.shp = shp;
    }

    public Double getSll() {
        return sll;
    }

    public void setSll(Double sll) {
        this.sll = sll;
    }

    public Double getSos() {
        return sos;
    }

    public void setSos(Double sos) {
        this.sos = sos;
    }

    public Double getSrd() {
        return srd;
    }

    public void setSrd(Double srd) {
        this.srd = srd;
    }

    public Double getStd() {
        return std;
    }

    public void setStd(Double std) {
        this.std = std;
    }

    public Double getSvc() {
        return svc;
    }

    public void setSvc(Double svc) {
        this.svc = svc;
    }

    public Double getSyp() {
        return syp;
    }

    public void setSyp(Double syp) {
        this.syp = syp;
    }

    public Double getSzl() {
        return szl;
    }

    public void setSzl(Double szl) {
        this.szl = szl;
    }

    public Double getThb() {
        return thb;
    }

    public void setThb(Double thb) {
        this.thb = thb;
    }

    public Double getTjs() {
        return tjs;
    }

    public void setTjs(Double tjs) {
        this.tjs = tjs;
    }

    public Double getTmt() {
        return tmt;
    }

    public void setTmt(Double tmt) {
        this.tmt = tmt;
    }

    public Double getTnd() {
        return tnd;
    }

    public void setTnd(Double tnd) {
        this.tnd = tnd;
    }

    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public Double getTry() {
        return _try;
    }

    public void setTry(Double _try) {
        this._try = _try;
    }

    public Double getTtd() {
        return ttd;
    }

    public void setTtd(Double ttd) {
        this.ttd = ttd;
    }

    public Double getTwd() {
        return twd;
    }

    public void setTwd(Double twd) {
        this.twd = twd;
    }

    public Double getTzs() {
        return tzs;
    }

    public void setTzs(Double tzs) {
        this.tzs = tzs;
    }

    public Double getUah() {
        return uah;
    }

    public void setUah(Double uah) {
        this.uah = uah;
    }

    public Double getUgx() {
        return ugx;
    }

    public void setUgx(Double ugx) {
        this.ugx = ugx;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public Double getUyu() {
        return uyu;
    }

    public void setUyu(Double uyu) {
        this.uyu = uyu;
    }

    public Double getUzs() {
        return uzs;
    }

    public void setUzs(Double uzs) {
        this.uzs = uzs;
    }

    public Double getVef() {
        return vef;
    }

    public void setVef(Double vef) {
        this.vef = vef;
    }

    public Double getVnd() {
        return vnd;
    }

    public void setVnd(Double vnd) {
        this.vnd = vnd;
    }

    public Double getVuv() {
        return vuv;
    }

    public void setVuv(Double vuv) {
        this.vuv = vuv;
    }

    public Double getWst() {
        return wst;
    }

    public void setWst(Double wst) {
        this.wst = wst;
    }

    public Double getXaf() {
        return xaf;
    }

    public void setXaf(Double xaf) {
        this.xaf = xaf;
    }

    public Double getXag() {
        return xag;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public Double getXau() {
        return xau;
    }

    public void setXau(Double xau) {
        this.xau = xau;
    }

    public Double getXcd() {
        return xcd;
    }

    public void setXcd(Double xcd) {
        this.xcd = xcd;
    }

    public Double getXdr() {
        return xdr;
    }

    public void setXdr(Double xdr) {
        this.xdr = xdr;
    }

    public Double getXof() {
        return xof;
    }

    public void setXof(Double xof) {
        this.xof = xof;
    }

    public Double getXpf() {
        return xpf;
    }

    public void setXpf(Double xpf) {
        this.xpf = xpf;
    }

    public Double getYer() {
        return yer;
    }

    public void setYer(Double yer) {
        this.yer = yer;
    }

    public Double getZar() {
        return zar;
    }

    public void setZar(Double zar) {
        this.zar = zar;
    }

    public Double getZmk() {
        return zmk;
    }

    public void setZmk(Double zmk) {
        this.zmk = zmk;
    }

    public Double getZmw() {
        return zmw;
    }

    public void setZmw(Double zmw) {
        this.zmw = zmw;
    }

    public Double getZwl() {
        return zwl;
    }

    public void setZwl(Double zwl) {
        this.zwl = zwl;
    }

}
