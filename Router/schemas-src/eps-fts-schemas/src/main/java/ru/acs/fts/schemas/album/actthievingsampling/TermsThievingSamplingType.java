
package ru.acs.fts.schemas.album.actthievingsampling;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� ������ ���� ��� ��������
 */
public class TermsThievingSamplingType
{
    private String weather;
    private String light;
    private List<String> arrangementList = new ArrayList<String>();
    private String sample;
    private String comments;
    private AddressThievingSamplingType addressThievingSampling;

    /** 
     * Get the 'Weather' element value. ������
     * 
     * @return value
     */
    public String getWeather() {
        return weather;
    }

    /** 
     * Set the 'Weather' element value. ������
     * 
     * @param weather
     */
    public void setWeather(String weather) {
        this.weather = weather;
    }

    /** 
     * Get the 'Light' element value. ���������: 0 - �������������; 1 - ������������
     * 
     * @return value
     */
    public String getLight() {
        return light;
    }

    /** 
     * Set the 'Light' element value. ���������: 0 - �������������; 1 - ������������
     * 
     * @param light
     */
    public void setLight(String light) {
        this.light = light;
    }

    /** 
     * Get the list of 'Arrangement' element items. �������� ������ - ����������� � ����������� �������, ����������� ��� ������ ���� ��� ��������
     * 
     * @return list
     */
    public List<String> getArrangementList() {
        return arrangementList;
    }

    /** 
     * Set the list of 'Arrangement' element items. �������� ������ - ����������� � ����������� �������, ����������� ��� ������ ���� ��� ��������
     * 
     * @param list
     */
    public void setArrangementList(List<String> list) {
        arrangementList = list;
    }

    /** 
     * Get the 'Sample' element value. ��������: 0 - �������; 1 - �����
     * 
     * @return value
     */
    public String getSample() {
        return sample;
    }

    /** 
     * Set the 'Sample' element value. ��������: 0 - �������; 1 - �����
     * 
     * @param sample
     */
    public void setSample(String sample) {
        this.sample = sample;
    }

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'AddressThievingSampling' element value. �����, �� �������� ���������� ����� ���� ��� ��������
     * 
     * @return value
     */
    public AddressThievingSamplingType getAddressThievingSampling() {
        return addressThievingSampling;
    }

    /** 
     * Set the 'AddressThievingSampling' element value. �����, �� �������� ���������� ����� ���� ��� ��������
     * 
     * @param addressThievingSampling
     */
    public void setAddressThievingSampling(
            AddressThievingSamplingType addressThievingSampling) {
        this.addressThievingSampling = addressThievingSampling;
    }
}
