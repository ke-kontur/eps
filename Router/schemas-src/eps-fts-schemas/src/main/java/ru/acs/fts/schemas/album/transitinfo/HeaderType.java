
package ru.acs.fts.schemas.album.transitinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������� ��
 */
public class HeaderType
{
    private String declarationKind;
    private String totalNumberOfGoods;
    private String totalNumberOfPackages;
    private String totalGrossMass;
    private String comment;
    private String departureCountryCode;
    private String destinationCountryCode;
    private LocalDate transitDateLimit;
    private List<TransportType> transportList = new ArrayList<TransportType>();
    private int choiceSelect = -1;
    private static final int TD_NUMBER_CHOICE = 0;
    private static final int TIRID_CHOICE = 1;
    private GTDIDType TDNumber;
    private TIRIDType TIRID;
    private CUOrganizationType carrier;

    /** 
     * Get the 'DeclarationKind' element value. ��� ���������� ����������.
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. ��� ���������� ����������.
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'TotalNumberOfGoods' element value. ����� ���������� �������.
     * 
     * @return value
     */
    public String getTotalNumberOfGoods() {
        return totalNumberOfGoods;
    }

    /** 
     * Set the 'TotalNumberOfGoods' element value. ����� ���������� �������.
     * 
     * @param totalNumberOfGoods
     */
    public void setTotalNumberOfGoods(String totalNumberOfGoods) {
        this.totalNumberOfGoods = totalNumberOfGoods;
    }

    /** 
     * Get the 'TotalNumberOfPackages' element value. ����� ���������� �������� ����.
     * 
     * @return value
     */
    public String getTotalNumberOfPackages() {
        return totalNumberOfPackages;
    }

    /** 
     * Set the 'TotalNumberOfPackages' element value. ����� ���������� �������� ����.
     * 
     * @param totalNumberOfPackages
     */
    public void setTotalNumberOfPackages(String totalNumberOfPackages) {
        this.totalNumberOfPackages = totalNumberOfPackages;
    }

    /** 
     * Get the 'TotalGrossMass' element value. ����� ��� ������
     * 
     * @return value
     */
    public String getTotalGrossMass() {
        return totalGrossMass;
    }

    /** 
     * Set the 'TotalGrossMass' element value. ����� ��� ������
     * 
     * @param totalGrossMass
     */
    public void setTotalGrossMass(String totalGrossMass) {
        this.totalGrossMass = totalGrossMass;
    }

    /** 
     * Get the 'Comment' element value. �����������.
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. �����������.
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'DepartureCountryCode' element value. ��� ������ �����������.
     * 
     * @return value
     */
    public String getDepartureCountryCode() {
        return departureCountryCode;
    }

    /** 
     * Set the 'DepartureCountryCode' element value. ��� ������ �����������.
     * 
     * @param departureCountryCode
     */
    public void setDepartureCountryCode(String departureCountryCode) {
        this.departureCountryCode = departureCountryCode;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. ��� ������ ����������.
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. ��� ������ ����������.
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'TransitDateLimit' element value. ���� ����������� ��������
     * 
     * @return value
     */
    public LocalDate getTransitDateLimit() {
        return transitDateLimit;
    }

    /** 
     * Set the 'TransitDateLimit' element value. ���� ����������� ��������
     * 
     * @param transitDateLimit
     */
    public void setTransitDateLimit(LocalDate transitDateLimit) {
        this.transitDateLimit = transitDateLimit;
    }

    /** 
     * Get the list of 'Transport' element items. ������������ ��������
     * 
     * @return list
     */
    public List<TransportType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. ������������ ��������
     * 
     * @param list
     */
    public void setTransportList(List<TransportType> list) {
        transportList = list;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if TDNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTDNumber() {
        return choiceSelect == TD_NUMBER_CHOICE;
    }

    /** 
     * Get the 'TDNumber' element value. ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getTDNumber() {
        return TDNumber;
    }

    /** 
     * Set the 'TDNumber' element value. ����� ���������� ����������
     * 
     * @param TDNumber
     */
    public void setTDNumber(GTDIDType TDNumber) {
        setChoiceSelect(TD_NUMBER_CHOICE);
        this.TDNumber = TDNumber;
    }

    /** 
     * Check if TIRID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTIRID() {
        return choiceSelect == TIRID_CHOICE;
    }

    /** 
     * Get the 'TIRID' element value. ����� ������ ���.
     * 
     * @return value
     */
    public TIRIDType getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. ����� ������ ���.
     * 
     * @param TIRID
     */
    public void setTIRID(TIRIDType TIRID) {
        setChoiceSelect(TIRID_CHOICE);
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }
}
