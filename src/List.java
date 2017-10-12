/**
 * Created by Leon Röscher on 30.05.2017.
 */
public class List {
    private int length = 0;
    private int k;
    public ListElement initelement;
    private ListElement newelement;
    private ListElement lastelement;

    private ListElement nextelement = null;
    private ListElement returnelement;

    private ListElement removedelement;
    private ListElement newpointer;


    public void append(String appendcontent) {
        if (length == 0) {
            initelement = new ListElement(appendcontent);
            lastelement = initelement;
            length = length + 1;
        }
        if (length >= 1) {
            newelement = new ListElement(appendcontent);
            lastelement.setNext(newelement);
            lastelement = newelement;
            length = length + 1;

        }
    }

    public ListElement getListElement(String tofindcontent, ListElement nextelement) {
    if (k <= length){
        if (nextelement == null){
            nextelement = initelement.getNext();
            k = k + 1;
        }
        if (initelement.getContent() == tofindcontent){
            return null;
        }
        if (nextelement.getNext().getContent()==tofindcontent){
            return returnelement=nextelement;
        }else {
            nextelement = nextelement.getNext();
            k = k + 1;
            return getListElement(tofindcontent,nextelement);
        }
    }
    return null;
    }

    public String remove(String content){
        if (content == null || content == ""){return null;}
        removedelement = getListElement(content,null).getNext();
        if (removedelement.getNext()==null){
            newpointer = getListElement(content,null);
        }else {
            newpointer = removedelement.getNext();
        }
        getListElement(content,null).setNext(newpointer);

        return removedelement.getContent();

    }

}
