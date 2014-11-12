
package ru.acs.fts.schemas.album.inspectionreqres;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Условие транспортировки груза через границу
 */
public class RequirementType
{
    private String type;
    private String description;
    private DocumentBaseType document;

    /** 
     * Get the 'Type' element value. Тип условия: 1 - Необходимость разрешения; 2 - Необходимость аттестации предприятия-изготовителя; 3 - Дополнительное условие разрешения; 4 - Наличие регистрации лекарственных средств и кормовых добавок; 5 - Наличие документа подтверждающего качество и безопасность лекарственных средств и кормовых добавок химического и микробиологического синтеза, ввозимых без ветеринарного сертификата; 6 - Наличие документа, подтверждающего приобретение в розничной сети чучел всех видов животных и рыб или их фрагментов, прошедших полную таксидермическую обработку
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип условия: 1 - Необходимость разрешения; 2 - Необходимость аттестации предприятия-изготовителя; 3 - Дополнительное условие разрешения; 4 - Наличие регистрации лекарственных средств и кормовых добавок; 5 - Наличие документа подтверждающего качество и безопасность лекарственных средств и кормовых добавок химического и микробиологического синтеза, ввозимых без ветеринарного сертификата; 6 - Наличие документа, подтверждающего приобретение в розничной сети чучел всех видов животных и рыб или их фрагментов, прошедших полную таксидермическую обработку
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Description' element value. Условие
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Условие
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'Document' element value. Документ
     * 
     * @return value
     */
    public DocumentBaseType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. Документ
     * 
     * @param document
     */
    public void setDocument(DocumentBaseType document) {
        this.document = document;
    }
}
