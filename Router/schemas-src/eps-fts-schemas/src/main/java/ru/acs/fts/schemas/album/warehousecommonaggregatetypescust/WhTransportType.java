
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� ������������� ��������
 */
public class WhTransportType
{
    private String transportModeCode;
    private String transportIdentifier;
    private Choice choice;

    /** 
     * Get the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'TransportIdentifier' element value. ����� �� (��� �������� ���������� ����������� ������������ �����, ��� ���� - ����� �����, ��� �������� ������ - ����� ������ � �.�.)
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. ����� �� (��� �������� ���������� ����������� ������������ �����, ��� ���� - ����� �����, ��� �������� ������ - ����� ������ � �.�.)
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the choice value.
     * 
     * @return value
     */
    public Choice getChoice() {
        return choice;
    }

    /** 
     * Set the choice value.
     * 
     * @param choice
     */
    public void setChoice(Choice choice) {
        this.choice = choice;
    }
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int AVIA_CHOICE = 0;
        private static final int AVTO_CHOICE = 1;
        private static final int RAIL_ROAD_CHOICE = 2;
        private static final int SEA_CHOICE = 3;
        private AviaParticularsType avia;
        private AvtoParticularsType avto;
        private RailRoadParticularsType railRoad;
        private SeaParticularsType sea;

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
         * Check if Avia is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifAvia() {
            return choiceSelect == AVIA_CHOICE;
        }

        /** 
         * Get the 'Avia' element value. ����������� ��� ����
         * 
         * @return value
         */
        public AviaParticularsType getAvia() {
            return avia;
        }

        /** 
         * Set the 'Avia' element value. ����������� ��� ����
         * 
         * @param avia
         */
        public void setAvia(AviaParticularsType avia) {
            setChoiceSelect(AVIA_CHOICE);
            this.avia = avia;
        }

        /** 
         * Check if Avto is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifAvto() {
            return choiceSelect == AVTO_CHOICE;
        }

        /** 
         * Get the 'Avto' element value. ����������� ��� ����
         * 
         * @return value
         */
        public AvtoParticularsType getAvto() {
            return avto;
        }

        /** 
         * Set the 'Avto' element value. ����������� ��� ����
         * 
         * @param avto
         */
        public void setAvto(AvtoParticularsType avto) {
            setChoiceSelect(AVTO_CHOICE);
            this.avto = avto;
        }

        /** 
         * Check if RailRoad is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifRailRoad() {
            return choiceSelect == RAIL_ROAD_CHOICE;
        }

        /** 
         * Get the 'RailRoad' element value. ����������� ��� �/�
         * 
         * @return value
         */
        public RailRoadParticularsType getRailRoad() {
            return railRoad;
        }

        /** 
         * Set the 'RailRoad' element value. ����������� ��� �/�
         * 
         * @param railRoad
         */
        public void setRailRoad(RailRoadParticularsType railRoad) {
            setChoiceSelect(RAIL_ROAD_CHOICE);
            this.railRoad = railRoad;
        }

        /** 
         * Check if Sea is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifSea() {
            return choiceSelect == SEA_CHOICE;
        }

        /** 
         * Get the 'Sea' element value. ����������� ��� ����/����
         * 
         * @return value
         */
        public SeaParticularsType getSea() {
            return sea;
        }

        /** 
         * Set the 'Sea' element value. ����������� ��� ����/����
         * 
         * @param sea
         */
        public void setSea(SeaParticularsType sea) {
            setChoiceSelect(SEA_CHOICE);
            this.sea = sea;
        }
    }
}
