package com.diegojacober.delivery.util;

import com.diegojacober.delivery.model.ProductSales;
import java.awt.BorderLayout;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Chart {

    public static JPanel createChartPanel(List<ProductSales> products) {
        DefaultCategoryDataset dataset = createDataset(products);
        JFreeChart barChart = createBarChart(dataset);
        ChartPanel chartPanel = new ChartPanel(barChart);

        JPanel panel = new JPanel();
        panel.setBounds(80, 60, 480, 200);
        panel.setLayout(new BorderLayout());
        panel.add(chartPanel);

        panel.setVisible(true);
        return panel;
    }

    public static DefaultCategoryDataset createDataset(List<ProductSales> products) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (products.size() >= 4) {
            dataset.addValue(products.get(0).getSalesQuantity(), products.get(0).getProductName(), NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(products.get(0).getSalesTotal()));
            dataset.addValue(products.get(1).getSalesQuantity(), products.get(1).getProductName(), NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(products.get(1).getSalesTotal()));
            dataset.addValue(products.get(2).getSalesQuantity(), products.get(2).getProductName(), NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(products.get(2).getSalesTotal()));
            dataset.addValue(products.get(3).getSalesQuantity(), products.get(3).getProductName(), NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(products.get(3).getSalesTotal()));
        }

        return dataset;
    }

    public static JFreeChart createBarChart(DefaultCategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Vendas de produtos", // Título do gráfico
                "Produto", // Rótulo do eixo X
                "Quantidade", // Rótulo do eixo Y
                dataset, // Conjunto de dados
                PlotOrientation.VERTICAL,
                true, true, false
        );
    }
}
