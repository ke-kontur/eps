
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания транспортного средства
 */
public class WhTransportType
{
    private String transportModeCode;
    private String transportIdentifier;
    private Choice choice;

    /** 
     * Get the 'TransportModeCode' element value. Код вида транспортного средства по классификатору видов транспорта и транспортировки товаров
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Код вида транспортного средства по классификатору видов транспорта и транспортировки товаров
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'TransportIdentifier' element value. Номер ТС (для морского транспорта указывается наименование судна, для авиа - номер борта, для железной дороги - номер вагона и т.д.)
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. Номер ТС (для морского транспорта указывается наименование судна, для авиа - номер борта, для железной дороги - номер вагона и т.д.)
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
         * Get the 'Avia' element value. Подробности для авиа
         * 
         * @return value
         */
        public AviaParticularsType getAvia() {
            return avia;
        }

        /** 
         * Set the 'Avia' element value. Подробности для авиа
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
         * Get the 'Avto' element value. Подробности для авто
         * 
         * @return value
         */
        public AvtoParticularsType getAvto() {
            return avto;
        }

        /** 
         * Set the 'Avto' element value. Подробности для авто
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
         * Get the 'RailRoad' element value. Подробности для ж/д
         * 
         * @return value
         */
        public RailRoadParticularsType getRailRoad() {
            return railRoad;
        }

        /** 
         * Set the 'RailRoad' element value. Подробности для ж/д
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
         * Get the 'Sea' element value. Подробности для моря/реки
         * 
         * @return value
         */
        public SeaParticularsType getSea() {
            return sea;
        }

        /** 
         * Set the 'Sea' element value. Подробности для моря/реки
         * 
         * @param sea
         */
        public void setSea(SeaParticularsType sea) {
            setChoiceSelect(SEA_CHOICE);
            this.sea = sea;
        }
    }
}
