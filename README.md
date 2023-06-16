# Machine Learning

## Predicting Health Status using Logistic Regression

The code includes some preprocessing steps to prepare the dataset for training. It drops irrelevant columns and handles missing values. Additional preprocessing steps may be added based on the specific dataset requirements.

### Model Training

The Logistic Regression model is trained using the provided dataset. The code performs gradient descent to optimize the model's parameters (weights and bias). You can adjust hyperparameters such as the number of iterations and learning rate as needed.
The model's performance is evaluated using several metrics, including accuracy and confusion matrix. The code calculates the accuracy of the model on the test set and displays the confusion matrix to assess the model's predictive power.

### Evaluation

- Cross-Validation. To assess the model's generalization performance, cross-validation with 5-fold is used. The code shows how to perform cross-validation and calculates the mean cross-validation score.
- Learning Curve. The learning curve of the model is plotted to visualize its performance with different training set sizes. The code generates a learning curve plot displaying the training score and validation score.

<a href="https://github.com/StYulia/Capstone_C23-PS217/blob/ML/models/LogisticRegression.ipynb" title="Learning Curve" target="_blank">
  <img src="https://github.com/adstika20/tutorial/blob/master/learningcurve.png" alt="Learning Curve" style="width: 500px">
</a>
  


## Content-Based Food Recommendation Model

This repository contains a content-based food recommendation model. The model uses attributes such as Name, C_Type, Veg_Non, and Describe to recommend food items based on user preferences.

## Preprocessing

The dataset goes through several preprocessing steps to prepare it for the recommendation model. These steps include:

- Loading the dataset using the pandas library.
- Removing irrelevant columns.
- Handling missing values, if any.
- Combining relevant attributes into a single feature.
- Applying TF-IDF vectorization to convert text data into numerical representations.

## Exploratory Data Analysis (EDA)

EDA is performed to gain insights into the dataset. The analysis includes:

- Calculation of basic statistics such as mean, median, and standard deviation.
- Visualization of attribute distributions using histograms and bar plots.
- Sample food item display to showcase the structure of the dataset.

## Model Building

The model is built using the content-based filtering approach. The steps involved are:

- Calculating cosine similarity between the food items based on their feature vectors.
- Generating a list of food recommendations by selecting the items with the highest similarity scores.

## Resources

In working on this project, several project or project resources are needed resources.

- **Language**
 
  <a href="https://www.python.org" title="Python" target="_blank">
    <img src="https://img.shields.io/badge/python-3670A0.svg?style=for-the-badge&logo=python&logoColor=ffdd54" />
  </a> &nbsp;
 
- **Library**
  
  <a href="https://pandas.pydata.org" title="Pandas" target="_blank">
    <img src="https://img.shields.io/badge/pandas-%23150458.svg?&style=for-the-badge&logo=pandas&logoColor=white" />
  </a> &nbsp;
  <a href="https://numpy.org" title="NumPy" target="_blank">
    <img src="https://img.shields.io/badge/numpy-%23013243.svg?&style=for-the-badge&logo=numpy&logoColor=white" />
  </a> &nbsp;
  <a href="https://scikit-learn.org" title="scikit-learn" target="_blank">
    <img src="https://img.shields.io/badge/scikit--learn-%23F7931E.svg?&style=for-the-badge&logo=scikit-learn&logoColor=3499CD" />
  </a> &nbsp;
  <a href="https://matplotlib.org" title="Matplotlib" target="_blank">
    <img src="https://custom-icon-badges.demolab.com/badge/matplotlib-66baea.svg?style=for-the-badge&logo=matplotlib" />
  </a> &nbsp;
  <a href="https://docs.python.org/3/library/pickle.html" title="Pickle" target="_blank">
    <img src="https://img.shields.io/badge/pickle-%23ffffff.svg?style=for-the-badge&logo=pickle&logoColor=black" />
  </a> &nbsp;
    <a href="https://www.tensorflow.org/" title="Tensorflow" target="_blank">
    <img src="https://img.shields.io/badge/tensorflow-%23150458.svg?&style=for-the-badge&logo=tensorflow&logoColor=yellow" />
  </a> &nbsp;
  
  
  
# Prerequisites
- [Jupyter Notebook](https://test-jupyter.readthedocs.io/en/latest/install.html) or [Google Colab](https://colab.research.google.com/)
- [Python](https://www.python.org/downloads/) version 3.9 or above
