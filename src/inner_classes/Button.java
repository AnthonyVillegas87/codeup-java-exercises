package inner_classes;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Function to handle our OnClick listener
    public void onClick() {
        this.onClickListener.onClick(this.title);
    }
    // Function to set our OnClick Listener
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        public void onClick(String title);
    }
}
