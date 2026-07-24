# Cloning a Specific GitHub Branch

Use the `git clone` command with the `-b` flag to copy files from a specific branch of a GitHub repository directly into a local folder.

## The Quickest Terminal Command (Recommended)

This approach downloads **only** the target branch. It places the contents directly into your desired folder without keeping the entire history of the project.

### Step-by-Step Instructions

IMPORTANTTTT:: USE GIT CLONE OUTSIDE YOUR REPOSITORY OR ELSE IT WILL OVERWRITE THE .GIT FOLDER. clone, delete .git and then move to your directory.
1. **Open your terminal**, command prompt, or Git Bash.
2. **Navigate** to the parent directory where your folder is located.
3. Delete the duplicated contents (if they are the same with the same name, there won't be a change in the commit history)
3.1 If you don't specify the FOLDER-NAME input it will paste on the current directory into a folder with the name of the repository.
4. **Run the following command** (replace the placeholders with your actual details):

```bash
git clone -b BRANCH-NAME --single-branch --depth 1 REPO-URL FOLDER-NAME
```

Then, run this command to clean-up nicely:

```bash
mv REPO-NAME/* REPO-NAME/.* . 2>/dev/null
```

```bash
rmdir REPO-NAME
```

### Parameter Breakdown

* **`-b BRANCH-NAME`**: Specifies the exact branch you want.
* **`--single-branch`**: Forces Git to only pull that specific branch instead of downloading all other branches.
* **`--depth 1`**: Creates a "shallow clone" that skips downloading old commit histories, making the download vastly faster.


You are looking at three inputs (arguments) passed to the mv command, not four.
In terminal commands, inputs are separated by spaces. The fourth item you saw (2>/dev/null) is actually a redirection operator, not an input to mv itself. The error suppression 2>/dev/null just hides warnings if there are no hidden files.

Here is the exact breakdown of how mv REPO-NAME/* REPO-NAME/.* . works:
## 1. The Command

* mv: Short for "move". It moves files or folders from one place to another. 

## 2. Input 1 (Source: Visible Files)

* REPO-NAME/*: The asterisk * is a wildcard meaning "everything". This tells the system to target every visible file and folder inside your repository folder. 

## 3. Input 2 (Source: Hidden Files)

* REPO-NAME/.*: In Mac/Linux, files starting with a dot (like .gitignore or .git) are hidden and ignored by the standard * wildcard. The .* specifically targets these hidden files so they do not get left behind. 

## 4. Input 3 (Destination)

* .: A single dot represents your current working directory. This tells the command exactly where to "spill" all the files it gathered from Input 1 and Input 2. 

## Summary of how mv handles it
The mv command can take multiple source inputs and move them all at once. The rule is always: "Move [Input 1] and [Input 2] into [The Last Input]." 


A
A
A
A
A
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B
B

