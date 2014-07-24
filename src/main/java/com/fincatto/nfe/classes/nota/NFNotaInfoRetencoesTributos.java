package com.fincatto.nfe.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.fincatto.nfe.classes.NFBase;
import com.fincatto.nfe.validadores.BigDecimalParser;

public class NFNotaInfoRetencoesTributos extends NFBase {
    @Element(name = "vRetPIS", required = false)
    private String valorRetidoPIS;

    @Element(name = "vRetCOFINS", required = false)
    private String valorRetidoCOFINS;

    @Element(name = "vRetCSLL", required = false)
    private String valorRetidoCSLL;

    @Element(name = "vBCIRRF", required = false)
    private String baseCalculoIRRF;

    @Element(name = "vIRRF", required = false)
    private String valorRetidoIRRF;

    @Element(name = "vBCRetPrev", required = false)
    private String baseCalculoRetencaoPrevidenciaSocial;

    @Element(name = "vRetPrev", required = false)
    private String valorRetencaoPrevidenciaSocial;

    public BigDecimal getValorRetidoPIS() {
        return new BigDecimal(this.valorRetidoPIS);
    }

    public void setValorRetidoPIS(final BigDecimal valorRetidoPIS) {
        this.valorRetidoPIS = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetidoPIS);
    }

    public BigDecimal getValorRetidoCOFINS() {
        return new BigDecimal(this.valorRetidoCOFINS);
    }

    public void setValorRetidoCOFINS(final BigDecimal valorRetidoCOFINS) {
        this.valorRetidoCOFINS = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetidoCOFINS);
    }

    public BigDecimal getValorRetidoCSLL() {
        return new BigDecimal(this.valorRetidoCSLL);
    }

    public void setValorRetidoCSLL(final BigDecimal valorRetidoCSLL) {
        this.valorRetidoCSLL = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetidoCSLL);
    }

    public BigDecimal getBaseCalculoIRRF() {
        return new BigDecimal(this.baseCalculoIRRF);
    }

    public void setBaseCalculoIRRF(final BigDecimal baseCalculoIRRF) {
        this.baseCalculoIRRF = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoIRRF);
    }

    public BigDecimal getValorRetidoIRRF() {
        return new BigDecimal(this.valorRetidoIRRF);
    }

    public void setValorRetidoIRRF(final BigDecimal valorRetidoIRRF) {
        this.valorRetidoIRRF = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetidoIRRF);
    }

    public BigDecimal getBaseCalculoRetencaoPrevidenciaSocial() {
        return new BigDecimal(this.baseCalculoRetencaoPrevidenciaSocial);
    }

    public void setBaseCalculoRetencaoPrevidenciaSocial(final BigDecimal baseCalculoRetencaoPrevidenciaSocial) {
        this.baseCalculoRetencaoPrevidenciaSocial = BigDecimalParser.tamanho15Com2CasasDecimais(baseCalculoRetencaoPrevidenciaSocial);
    }

    public BigDecimal getValorRetencaoPrevidenciaSocial() {
        return new BigDecimal(this.valorRetencaoPrevidenciaSocial);
    }

    public void setValorRetencaoPrevidenciaSocial(final BigDecimal valorRetencaoPrevidenciaSocial) {
        this.valorRetencaoPrevidenciaSocial = BigDecimalParser.tamanho15Com2CasasDecimais(valorRetencaoPrevidenciaSocial);
    }
}