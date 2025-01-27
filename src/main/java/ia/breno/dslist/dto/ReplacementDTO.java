package ia.breno.dslist.dto;

import ia.breno.dslist.entities.Belonging;

public class ReplacementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }
}
