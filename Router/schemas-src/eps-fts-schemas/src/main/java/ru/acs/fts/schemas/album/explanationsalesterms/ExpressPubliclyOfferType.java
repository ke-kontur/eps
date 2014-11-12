
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Каким образом была выражена публичная оферта Продавца.
 */
public class ExpressPubliclyOfferType
{
    private String priceList;
    private String priceListAddressOffice;
    private String publicSourcePrinting;
    private String publicSourcePrintingComments;
    private String media;
    private String mediaComments;
    private String site;
    private String siteAddress;
    private String otherwise;
    private String otherwiseComments;

    /** 
     * Get the 'PriceList' element value. Признак выражения публичной оферты в прайс-листе в офисе продавца
     * 
     * @return value
     */
    public String getPriceList() {
        return priceList;
    }

    /** 
     * Set the 'PriceList' element value. Признак выражения публичной оферты в прайс-листе в офисе продавца
     * 
     * @param priceList
     */
    public void setPriceList(String priceList) {
        this.priceList = priceList;
    }

    /** 
     * Get the 'PriceListAddressOffice' element value. В прайс-листе в офисе продавца (указать фактический адрес)
     * 
     * @return value
     */
    public String getPriceListAddressOffice() {
        return priceListAddressOffice;
    }

    /** 
     * Set the 'PriceListAddressOffice' element value. В прайс-листе в офисе продавца (указать фактический адрес)
     * 
     * @param priceListAddressOffice
     */
    public void setPriceListAddressOffice(String priceListAddressOffice) {
        this.priceListAddressOffice = priceListAddressOffice;
    }

    /** 
     * Get the 'PublicSourcePrinting' element value. Признак выражения публичной оферты в открытом источнике печати
     * 
     * @return value
     */
    public String getPublicSourcePrinting() {
        return publicSourcePrinting;
    }

    /** 
     * Set the 'PublicSourcePrinting' element value. Признак выражения публичной оферты в открытом источнике печати
     * 
     * @param publicSourcePrinting
     */
    public void setPublicSourcePrinting(String publicSourcePrinting) {
        this.publicSourcePrinting = publicSourcePrinting;
    }

    /** 
     * Get the 'PublicSourcePrintingComments' element value. В открытом источнике печати (указать каком, где и когда издан)
     * 
     * @return value
     */
    public String getPublicSourcePrintingComments() {
        return publicSourcePrintingComments;
    }

    /** 
     * Set the 'PublicSourcePrintingComments' element value. В открытом источнике печати (указать каком, где и когда издан)
     * 
     * @param publicSourcePrintingComments
     */
    public void setPublicSourcePrintingComments(
            String publicSourcePrintingComments) {
        this.publicSourcePrintingComments = publicSourcePrintingComments;
    }

    /** 
     * Get the 'Media' element value. Признак выражения публичной оферты в других средствах массовой информации
     * 
     * @return value
     */
    public String getMedia() {
        return media;
    }

    /** 
     * Set the 'Media' element value. Признак выражения публичной оферты в других средствах массовой информации
     * 
     * @param media
     */
    public void setMedia(String media) {
        this.media = media;
    }

    /** 
     * Get the 'MediaComments' element value. В других средствах массовой информации (указать, в каких и когда)
     * 
     * @return value
     */
    public String getMediaComments() {
        return mediaComments;
    }

    /** 
     * Set the 'MediaComments' element value. В других средствах массовой информации (указать, в каких и когда)
     * 
     * @param mediaComments
     */
    public void setMediaComments(String mediaComments) {
        this.mediaComments = mediaComments;
    }

    /** 
     * Get the 'Site' element value. Признак выражения публичной оферты на открытом сайте продавца в интернете
     * 
     * @return value
     */
    public String getSite() {
        return site;
    }

    /** 
     * Set the 'Site' element value. Признак выражения публичной оферты на открытом сайте продавца в интернете
     * 
     * @param site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /** 
     * Get the 'SiteAddress' element value. На открытом сайте Продавца в Интернете (указать адрес)
     * 
     * @return value
     */
    public String getSiteAddress() {
        return siteAddress;
    }

    /** 
     * Set the 'SiteAddress' element value. На открытом сайте Продавца в Интернете (указать адрес)
     * 
     * @param siteAddress
     */
    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    /** 
     * Get the 'Otherwise' element value. Признак выражения публичной оферты иным образом
     * 
     * @return value
     */
    public String getOtherwise() {
        return otherwise;
    }

    /** 
     * Set the 'Otherwise' element value. Признак выражения публичной оферты иным образом
     * 
     * @param otherwise
     */
    public void setOtherwise(String otherwise) {
        this.otherwise = otherwise;
    }

    /** 
     * Get the 'OtherwiseComments' element value. Иные образом (указать подробности)
     * 
     * @return value
     */
    public String getOtherwiseComments() {
        return otherwiseComments;
    }

    /** 
     * Set the 'OtherwiseComments' element value. Иные образом (указать подробности)
     * 
     * @param otherwiseComments
     */
    public void setOtherwiseComments(String otherwiseComments) {
        this.otherwiseComments = otherwiseComments;
    }
}
