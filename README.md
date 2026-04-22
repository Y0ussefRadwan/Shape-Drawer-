# 🎨 Shape Drawer Project (Java)

## 📌 Overview

This project is a simple **Java application** that reads geometric shapes from a file, processes them, calculates their total area, and displays them using a **Graphical User Interface (GUI)** built with Java Swing.

It also saves the total calculated area into an output file.

---

## ⚙️ Features

* 📂 Reads shapes data from `input.txt`
* 🔷 Supports multiple shapes (Circle, Cube)
* ⚠️ Input validation (handles invalid values and unknown shapes)
* 📊 Calculates total area of all shapes
* 💾 Saves result to `sumAreas.txt`
* 🖥️ Displays shapes using Java Swing GUI

---

## 📥 Input File Format (`input.txt`)

```
number_of_shapes
shape_type value
shape_type value
...
```

### Example:

```
3
circle 5
cube 2
circle 4
```

---

## 🚀 How It Works

1. The program reads the number of shapes from the file.
2. It creates an array of `Drawable` objects.
3. For each shape:

   * Reads the type (circle or cube)
   * Reads its value
   * Creates the corresponding object
4. Calculates total area of all shapes.
5. Writes the total area into `sumAreas.txt`.
6. Displays all shapes in a GUI window.

---

## 🧠 Concepts Used

* File Handling (Java I/O)
* Object-Oriented Programming (OOP)
* Inheritance & Polymorphism
* Exception Handling
* Java Swing (GUI)
* Arrays of Objects

---

## 📤 Output Files

* `sumAreas.txt` → Contains total area of all shapes

---

## 🖥️ GUI

The program opens a window titled:

```
Shape Drawer
```

It visually displays the shapes using `ShapeGUI`.

---

## ⚠️ Error Handling

* Missing input file → program stops with error message
* Invalid number of shapes → rejected
* Unknown shape type → ignored with warning
* Negative values → not accepted

---

## 📌 Future Improvements

* Add more shapes (Rectangle, Triangle, Sphere)
* Improve GUI design with colors and interaction
* Add dynamic user input instead of file only
* Save graphical output as image

---

## 👩‍💻 Author
youssef elbeshbeshy
