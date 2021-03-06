package ru.softbalance.equipment.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

@JsonInclude(JsonInclude.Include.NON_EMPTY)
class Parameters {
    var font: Int? = null

    var bold: Boolean? = null

    var italic: Boolean? = null

    @JsonProperty("dblheight")
    var doubleHeight: Boolean? = null

    var underline: Boolean? = null

    var overline: Boolean? = null

    var negative: Boolean? = null

    var upsideDown: Boolean? = null

    var zeroSlashed: Boolean? = null

    var charRotation: Int? = null

    var standardColor: Boolean? = null

    var wrap: Boolean? = null

    @Alignment
    var alignment: String? = null

    var newLine: Boolean? = null

    var lineSpacingMax: Boolean? = null

    var barCodeHeight: Int? = null

    var barCodeType: String? = null

    @JsonProperty("BarCodeHasCC")
    var barCodeHasControlSymbol: Boolean? = null

    var barCodePrintText: Boolean? = null

    var price: BigDecimal? = null

    var quantity: BigDecimal? = null

    var department: Int? = null

    @JsonProperty("Summ")
    var sum: BigDecimal? = null

    var typeClose: Int? = null

    @JsonProperty("EnableCheckSumm")
    var enableCheckSum: Boolean? = null

    var tax: Int? = null

    var printDoc: Boolean? = null

    @ReportType
    var reportType: Int? = null

    var itemType: Int? = null // предмет расчета

    var paymentMode: Int? = null // способ расчета

    var clientContact: String? = null

    var cashierINN: String? = null

    var cashierPosition: String? = null

    var cashierName: String? = null

    var paymentPlace: String? = null
}
