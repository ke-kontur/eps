
package ru.acs.fts.schemas.album.freedoc;

import java.util.ArrayList;
import java.util.List;

/** 
 * Тело документа
 */
public class DocumentBodyType
{
    private List<Choice> choiceList = new ArrayList<Choice>();

    /** 
     * Get the list of 'DocumentBodyType' complexType items.
     * 
     * @return list
     */
    public List<Choice> getChoiceList() {
        return choiceList;
    }

    /** 
     * Set the list of 'DocumentBodyType' complexType items.
     * 
     * @param list
     */
    public void setChoiceList(List<Choice> list) {
        choiceList = list;
    }
    public static class Choice
    {
        private int choiceListSelect = -1;
        private static final int TEXT_SECTION_LIST_CHOICE = 0;
        private static final int TABLE_LIST_CHOICE = 1;
        private List<TextSectionType> textSectionList = new ArrayList<TextSectionType>();
        private List<TableType> tableList = new ArrayList<TableType>();

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
         * Check if TextSectionList is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTextSectionList() {
            return choiceListSelect == TEXT_SECTION_LIST_CHOICE;
        }

        /** 
         * Get the list of 'TextSection' element items. Текстовый раздел
         * 
         * @return list
         */
        public List<TextSectionType> getTextSectionList() {
            return textSectionList;
        }

        /** 
         * Set the list of 'TextSection' element items. Текстовый раздел
         * 
         * @param list
         */
        public void setTextSectionList(List<TextSectionType> list) {
            setChoiceListSelect(TEXT_SECTION_LIST_CHOICE);
            textSectionList = list;
        }

        /** 
         * Check if TableList is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTableList() {
            return choiceListSelect == TABLE_LIST_CHOICE;
        }

        /** 
         * Get the list of 'Table' element items. Таблица
         * 
         * @return list
         */
        public List<TableType> getTableList() {
            return tableList;
        }

        /** 
         * Set the list of 'Table' element items. Таблица
         * 
         * @param list
         */
        public void setTableList(List<TableType> list) {
            setChoiceListSelect(TABLE_LIST_CHOICE);
            tableList = list;
        }
    }
}
