
package ru.acs.fts.schemas.album.inspectionreqres;

/** 
 * Решение, принятое таможенным инспектором по результатам документарного контроля
 */
public class InspectionDecisionType
{
    private String type;
    private String decision;

    /** 
     * Get the 'Type' element value. Тип решения: 0 - Решение не определено; 1 - Ввоз разрешен (разрешение); 2 - Вывоз разрешен (разрешение); 3 - Транзит разрешен (разрешение); 4 - Ввоз запрещен (запрет); 5 - Вывоз запрещен (запрет); 6 - Транзит запрещен (запрет); 7 - Отправить на ветеринарный досмотр (запрет); 8 - Досмотр невозможен по техническим причинам (разрешение); 9 - Груз задержан (запрет)
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип решения: 0 - Решение не определено; 1 - Ввоз разрешен (разрешение); 2 - Вывоз разрешен (разрешение); 3 - Транзит разрешен (разрешение); 4 - Ввоз запрещен (запрет); 5 - Вывоз запрещен (запрет); 6 - Транзит запрещен (запрет); 7 - Отправить на ветеринарный досмотр (запрет); 8 - Досмотр невозможен по техническим причинам (разрешение); 9 - Груз задержан (запрет)
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Decision' element value. Текст решения
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. Текст решения
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }
}
