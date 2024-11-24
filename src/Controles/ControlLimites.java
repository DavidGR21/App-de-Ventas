package Controles;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class ControlLimites extends DocumentFilter {

    private final int maxCharacters;

    public ControlLimites(int maxChars) {
        maxCharacters = maxChars;
    }

    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset, String str, AttributeSet attr) throws BadLocationException {
        if ((fb.getDocument().getLength() + str.length()) <= maxCharacters) {
            super.insertString(fb, offset, str, attr);
        }
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String str, AttributeSet attr) throws BadLocationException {
        if ((fb.getDocument().getLength() + str.length() - length) <= maxCharacters) {
            super.replace(fb, offset, length, str, attr);
        }
    }
}
