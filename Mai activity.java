public class MainActivity extends AppCompatActivity {

    private TextView questionTextView;
    private RadioGroup optionRadioGroup;
    private Button submitButton;

    private String[] questions;
    private String[][] options;
    private int[] answers;
    private int currentQuestionIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to UI elements
        questionTextView = findViewById(R.id.question_text_view);
        optionRadioGroup = findViewById(R.id.option_radio_group);
        submitButton = findViewById(R.id.submit_button);

        // Initialize quiz data
        questions = new String[] {
                "What is the capital of India?",
                "What is the largest planet in our solar system?",
                "Who is the author of 'The Adventures of Sherlock Holmes'?"
        };
        options = new String[][] {
                {"New Delhi", "Mumbai", "Kolkata", "Chennai"},
                {"Jupiter", "Saturn", "Neptune", "Uranus"},
                {"Arthur Conan Doyle", "Agatha Christie", "Dorothy L. Sayers", "P. D. James"}
        };
        answers = new int[] {0, 0, 0};
        currentQuestionIndex = 0;

        // Set up the first question
        setQuestion(currentQuestionIndex);

        // Set up the submit button click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if an option is selected
                int selectedOptionId = optionRadioGroup.getCheckedRadioButtonId();
                if
