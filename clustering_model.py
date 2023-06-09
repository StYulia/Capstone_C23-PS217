import pickle
import numpy as np

class ClusteringModel:
    def __init__(self, model_path):
        self.model_path = model_path
        self.model = self.load_model()

    def load_model(self):
        with open(self.model_path, 'rb') as f:
            model = pickle.load(f)
        return model

    def perform_clustering(self, data):
        # Lakukan inferensi pada data menggunakan model clustering
        # Misalnya: labels = self.model.predict(data)
        # Anda dapat menggunakan numpy untuk memanipulasi data input dan output
        labels = self.model.predict(data)
        return labels
