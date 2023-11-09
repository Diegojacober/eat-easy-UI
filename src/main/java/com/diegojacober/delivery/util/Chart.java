package com.diegojacober.delivery.util;

import com.diegojacober.delivery.model.ProductSales;
import java.awt.BorderLayout;
import java.util.List;
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
        panel.setBounds(80, 60, 410, 190);
        panel.setLayout(new BorderLayout());
        panel.add(chartPanel);

        panel.setVisible(true);
        return panel;
    }
    
    public static DefaultCategoryDataset createDataset(List<ProductSales> products) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(products.get(0).getSalesQuantity(), products.get(0).getProductName(), products.get(0).getProductName());
        dataset.addValue(products.get(1).getSalesQuantity(), products.get(1).getProductName(), products.get(1).getProductName());
        dataset.addValue(products.get(2).getSalesQuantity(), products.get(2).getProductName(), products.get(2).getProductName());
        return dataset;
    }

    public static JFreeChart createBarChart(DefaultCategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Vendas de produtos",     // Título do gráfico
                "Produto",             // Rótulo do eixo X
                "Quantidade",                // Rótulo do eixo Y
                dataset,                // Conjunto de dados
                PlotOrientation.VERTICAL,
                true, true, false
        );
    }
}
