
package ru.acs.fts.schemas.album.responsemca;

import java.util.ArrayList;
import java.util.List;

/** 
 * Строка таблицы
 */
public class TableRowType
{
    private List<Choice> choiceList = new ArrayList<Choice>();

    /** 
     * Get the list of 'TableRowType' complexType items.
     * 
     * @return list
     */
    public List<Choice> getChoiceList() {
        return choiceList;
    }

    /** 
     * Set the list of 'TableRowType' complexType items.
     * 
     * @param list
     */
    public void setChoiceList(List<Choice> list) {
        choiceList = list;
    }
    public static class Choice
    {
        private int choiceListSelect = -1;
        private static final int TABLE_CELL_LIST_CHOICE = 0;
        private static final int ENTRY_CELL_LIST_CHOICE = 1;
        private static final int GOOD_NUM_CHOICE = 2;
        private List<CellType> tableCellList = new ArrayList<CellType>();
        private List<EntryTableType> entryCellList = new ArrayList<EntryTableType>();
        private String goodNum;

        private void setChoiceListSelect(int choice) {
            if (choiceListSelect == -1) {
                choiceListSelect = choice;
            } else if (choiceListSelect != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoiceListSelect() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoiceListSelect() {
            choiceListSelect = -1;
        }

        /** 
         * Check if TableCellList is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTableCellList() {
            return choiceListSelect == TABLE_CELL_LIST_CHOICE;
        }

        /** 
         * Get the list of 'TableCell' element items. Ячейка таблицы
         * 
         * @return list
         */
        public List<CellType> getTableCellList() {
            return tableCellList;
        }

        /** 
         * Set the list of 'TableCell' element items. Ячейка таблицы
         * 
         * @param list
         */
        public void setTableCellList(List<CellType> list) {
            setChoiceListSelect(TABLE_CELL_LIST_CHOICE);
            tableCellList = list;
        }

        /** 
         * Check if EntryCellList is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifEntryCellList() {
            return choiceListSelect == ENTRY_CELL_LIST_CHOICE;
        }

        /** 
         * Get the list of 'EntryCell' element items. Ячейка с вложенной таблицей
         * 
         * @return list
         */
        public List<EntryTableType> getEntryCellList() {
            return entryCellList;
        }

        /** 
         * Set the list of 'EntryCell' element items. Ячейка с вложенной таблицей
         * 
         * @param list
         */
        public void setEntryCellList(List<EntryTableType> list) {
            setChoiceListSelect(ENTRY_CELL_LIST_CHOICE);
            entryCellList = list;
        }

        /** 
         * Check if GoodNum is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifGoodNum() {
            return choiceListSelect == GOOD_NUM_CHOICE;
        }

        /** 
         * Get the 'GoodNum' element value. Номер товара в ДТ
         * 
         * @return value
         */
        public String getGoodNum() {
            return goodNum;
        }

        /** 
         * Set the 'GoodNum' element value. Номер товара в ДТ
         * 
         * @param goodNum
         */
        public void setGoodNum(String goodNum) {
            setChoiceListSelect(GOOD_NUM_CHOICE);
            this.goodNum = goodNum;
        }
    }
}
