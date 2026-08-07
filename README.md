# Gutenberg Paragraph Justifier  
**File I/O + Text Transformation Lab**

---

## Overview

In this lab, you will write a program that reads a plain-text work from Project Gutenberg and produces a newly formatted version of that text.


You will:

- Read a text file line by line  
- Trim leading and trailing whitespace  
- Normalize paragraph spacing  
- Apply consistent indentation  
- Write the transformed text to a new output file  

---

## Repository Structure

```

project-root/
│
├── src/
│   └── GutenbergParagraphJustifier.java
│
├── data/
│   ├── input/
│   │   └── (place your Gutenberg .txt files here)
│   │
│   └── output/
│       └── (your formatted files will be written here)
│
└── README.md

```


---


## Part 0 — Choosing a Text

Select a short work of fiction from Project Gutenberg. Short means **under 2500 lines**. 

Examples:
- The Tell-Tale Heart  
- The Gift of the Magi  
- The Yellow Wallpaper  

Download the Plain Text UTF-8 version and place it as a `.txt` file inside `data/input/`

---

## Part 1 — Paragraph Justifier (Required)

Your program must:

1. Read a text file from `data/input/`.
2. Process the file line by line.
3. Trim leading and trailing whitespace from every line.
4. Collapse multiple consecutive blank lines into exactly one blank line.
5. Indent every nonblank line using a fixed number of spaces (`TAB_SIZE`).
6. Write the result to a new file inside `data/output/`.

---

## Formatting Rules

- A blank line is a line where `trim()` results in "".
- Only one blank line may appear between paragraphs.
- All nonblank lines must begin with `TAB_SIZE` spaces.
- Do not use the tab character (`\t`). Use spaces only.
- Do not add trailing spaces to any line.

---

## Example Input
```
   It is impossible to say how first the idea entered my brain;  
but once conceived, it haunted me day and night.    


Object there was none. Passion there was none.


   I loved the old man. He had never wronged me.

Notice:
- Irregular indentation  
- Extra blank lines  
- Trailing spaces  
```
---

## Example Output (Formatted)
```
    It is impossible to say how first the idea entered my brain;
    but once conceived, it haunted me day and night.

    Object there was none. Passion there was none.

    I loved the old man. He had never wronged me.
```

---

## Part 2 — Gutenberg Header/Footer Removal (Optional Extension)

Project Gutenberg files contain header and footer text that is not part of the story.

As an optional enhancement, modify your program so that:

- It begins copying text only after a line containing `*** START`
- It stops copying when a line containing `*** END` is encountered

Only the story content between these markers should appear in your output file.

---

## Example Header Removal

### Input Snippet:
```

*** START OF THE PROJECT GUTENBERG EBOOK THE TELL-TALE HEART ***

It is impossible to say how first the idea entered my brain...

*** END OF THE PROJECT GUTENBERG EBOOK THE TELL-TALE HEART ***
```

### Output Snippet:
```
    It is impossible to say how first the idea entered my brain...

The header and footer lines are removed entirely.
```
---


## Running the Program

1. Place your chosen `.txt` file in data/input/.
2. Run your program from the project root.
3. When prompted, enter:
   - The input file name (e.g., `data/input/telltale.txt`)
   - The desired output file name (e.g., `data/output/telltale_formatted.txt`)

After execution, your formatted file should appear in data/output/.

---


## Submission

Submit a link to your Feedback PR to the Canvas assignment. Duh!

