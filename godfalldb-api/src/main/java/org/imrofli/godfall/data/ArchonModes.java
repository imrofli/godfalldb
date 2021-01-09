package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;

public class ArchonModes {
    private ArchonModeDefault archonModeDefault;
    private ArchonMode archonModeHinterclaw;
    private ArchonMode archonModeIllumina;
    private ArchonMode archonModeGrayehawk;
    private ArchonMode archonModeSilvermane;
    private ArchonMode archonModeBulwark;
    private ArchonMode archonModePhoenix;
    private ArchonMode archonModeTyphon;
    private ArchonMode archonModeVertigo;
    private ArchonMode archonModeMesa;
    private ArchonMode archonModeMoebius;
    private ArchonMode archonModeArmistice;
    private ArchonMode archonModeSirius;

    @JsonProperty("ArchonMode.Default")
    public ArchonModeDefault getArchonModeDefault() { return archonModeDefault; }
    @JsonProperty("ArchonMode.Default")
    public void setArchonModeDefault(ArchonModeDefault value) { this.archonModeDefault = value; }

    @JsonProperty("ArchonMode.Hinterclaw")
    public ArchonMode getArchonModeHinterclaw() { return archonModeHinterclaw; }
    @JsonProperty("ArchonMode.Hinterclaw")
    public void setArchonModeHinterclaw(ArchonMode value) { this.archonModeHinterclaw = value; }

    @JsonProperty("ArchonMode.Illumina")
    public ArchonMode getArchonModeIllumina() { return archonModeIllumina; }
    @JsonProperty("ArchonMode.Illumina")
    public void setArchonModeIllumina(ArchonMode value) { this.archonModeIllumina = value; }

    @JsonProperty("ArchonMode.Grayehawk")
    public ArchonMode getArchonModeGrayehawk() { return archonModeGrayehawk; }
    @JsonProperty("ArchonMode.Grayehawk")
    public void setArchonModeGrayehawk(ArchonMode value) { this.archonModeGrayehawk = value; }

    @JsonProperty("ArchonMode.Silvermane")
    public ArchonMode getArchonModeSilvermane() { return archonModeSilvermane; }
    @JsonProperty("ArchonMode.Silvermane")
    public void setArchonModeSilvermane(ArchonMode value) { this.archonModeSilvermane = value; }

    @JsonProperty("ArchonMode.Bulwark")
    public ArchonMode getArchonModeBulwark() { return archonModeBulwark; }
    @JsonProperty("ArchonMode.Bulwark")
    public void setArchonModeBulwark(ArchonMode value) { this.archonModeBulwark = value; }

    @JsonProperty("ArchonMode.Phoenix")
    public ArchonMode getArchonModePhoenix() { return archonModePhoenix; }
    @JsonProperty("ArchonMode.Phoenix")
    public void setArchonModePhoenix(ArchonMode value) { this.archonModePhoenix = value; }

    @JsonProperty("ArchonMode.Typhon")
    public ArchonMode getArchonModeTyphon() { return archonModeTyphon; }
    @JsonProperty("ArchonMode.Typhon")
    public void setArchonModeTyphon(ArchonMode value) { this.archonModeTyphon = value; }

    @JsonProperty("ArchonMode.Vertigo")
    public ArchonMode getArchonModeVertigo() { return archonModeVertigo; }
    @JsonProperty("ArchonMode.Vertigo")
    public void setArchonModeVertigo(ArchonMode value) { this.archonModeVertigo = value; }

    @JsonProperty("ArchonMode.Mesa")
    public ArchonMode getArchonModeMesa() { return archonModeMesa; }
    @JsonProperty("ArchonMode.Mesa")
    public void setArchonModeMesa(ArchonMode value) { this.archonModeMesa = value; }

    @JsonProperty("ArchonMode.Moebius")
    public ArchonMode getArchonModeMoebius() { return archonModeMoebius; }
    @JsonProperty("ArchonMode.Moebius")
    public void setArchonModeMoebius(ArchonMode value) { this.archonModeMoebius = value; }

    @JsonProperty("ArchonMode.Armistice")
    public ArchonMode getArchonModeArmistice() { return archonModeArmistice; }
    @JsonProperty("ArchonMode.Armistice")
    public void setArchonModeArmistice(ArchonMode value) { this.archonModeArmistice = value; }

    @JsonProperty("ArchonMode.Sirius")
    public ArchonMode getArchonModeSirius() { return archonModeSirius; }
    @JsonProperty("ArchonMode.Sirius")
    public void setArchonModeSirius(ArchonMode value) { this.archonModeSirius = value; }
}
