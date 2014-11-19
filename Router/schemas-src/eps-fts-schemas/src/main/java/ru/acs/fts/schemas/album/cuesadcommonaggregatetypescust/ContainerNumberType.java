
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * ����� ����������
 */
public class ContainerNumberType
{
    private String containerIdentificaror;
    private String fullIndicator;

    /** 
     * Get the 'ContainerIdentificaror' element value. ����� (�������������) ����������
     * 
     * @return value
     */
    public String getContainerIdentificaror() {
        return containerIdentificaror;
    }

    /** 
     * Set the 'ContainerIdentificaror' element value. ����� (�������������) ����������
     * 
     * @param containerIdentificaror
     */
    public void setContainerIdentificaror(String containerIdentificaror) {
        this.containerIdentificaror = containerIdentificaror;
    }

    /** 
     * Get the 'FullIndicator' element value. ������� ���������� ����������. 1 - ����� �������� ���� ���������  2- ����� �������� ����� ����������
     * 
     * @return value
     */
    public String getFullIndicator() {
        return fullIndicator;
    }

    /** 
     * Set the 'FullIndicator' element value. ������� ���������� ����������. 1 - ����� �������� ���� ���������  2- ����� �������� ����� ����������
     * 
     * @param fullIndicator
     */
    public void setFullIndicator(String fullIndicator) {
        this.fullIndicator = fullIndicator;
    }
}
