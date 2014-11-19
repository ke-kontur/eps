
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

/** 
 * �������� �� �����������/���������� �������
 */
public class InConsParticipantType extends InParticipantType
{
    private String bowelsINN;
    private String bowelsOKPO;
    private String contractorIndicator;

    /** 
     * Get the 'BowelsINN' element value. ��� �����������������.
     * 
     * @return value
     */
    public String getBowelsINN() {
        return bowelsINN;
    }

    /** 
     * Set the 'BowelsINN' element value. ��� �����������������.
     * 
     * @param bowelsINN
     */
    public void setBowelsINN(String bowelsINN) {
        this.bowelsINN = bowelsINN;
    }

    /** 
     * Get the 'BowelsOKPO' element value. ���� �����������������.
     * 
     * @return value
     */
    public String getBowelsOKPO() {
        return bowelsOKPO;
    }

    /** 
     * Set the 'BowelsOKPO' element value. ���� �����������������.
     * 
     * @param bowelsOKPO
     */
    public void setBowelsOKPO(String bowelsOKPO) {
        this.bowelsOKPO = bowelsOKPO;
    }

    /** 
     * Get the 'ContractorIndicator' element value. ����������� ��������� ��������:1-����������; 2 - ������ �� ������.
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. ����������� ��������� ��������:1-����������; 2 - ������ �� ������.
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
    }
}
