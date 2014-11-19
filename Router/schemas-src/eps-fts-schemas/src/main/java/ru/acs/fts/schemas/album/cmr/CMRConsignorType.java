
package ru.acs.fts.schemas.album.cmr;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * �������� � ���������������� (��.1)
 */
public class CMRConsignorType extends OrganizationType
{
    private OrganizationType guarantee;
    private TerminalType terminal;

    /** 
     * Get the 'Guarantee' element value. ����������. ����������� �� ���������  ������� ������������ ����
     * 
     * @return value
     */
    public OrganizationType getGuarantee() {
        return guarantee;
    }

    /** 
     * Set the 'Guarantee' element value. ����������. ����������� �� ���������  ������� ������������ ����
     * 
     * @param guarantee
     */
    public void setGuarantee(OrganizationType guarantee) {
        this.guarantee = guarantee;
    }

    /** 
     * Get the 'Terminal' element value. ������������ � �������������� ������ / ���������
     * 
     * @return value
     */
    public TerminalType getTerminal() {
        return terminal;
    }

    /** 
     * Set the 'Terminal' element value. ������������ � �������������� ������ / ���������
     * 
     * @param terminal
     */
    public void setTerminal(TerminalType terminal) {
        this.terminal = terminal;
    }
}
