import pickle
import numpy as np

class RecommendationModel:
    def __init__(self, model_path):
        self.model_path = model_path
        self.model = self.load_model()

    def load_model(self):
        with open(self.model_path, 'rb') as f:
            model = pickle.load(f)
        return model

    def make_recommendations(self, tinggi_badan, berat_badan, usia, trimester):
        # Konversi input ke format yang sesuai (misalnya, array numpy)
        input_data = np.array([[tinggi_badan, berat_badan, usia, trimester]])

        
        recommendations = self.model.get_recommendations(input_data)
        return recommendations
