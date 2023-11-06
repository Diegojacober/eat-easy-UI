package com.diegojacober.delivery.util;

import java.awt.Font;

import javax.swing.*;
import javax.swing.table.*;

public class Table {

    public JTable createTable(JPanel jpn, Object[] width, Object[] pos, Object[] col) throws NullPointerException {
        JTable table = new JTable(new DefaultTableModel());

        table.setVisible(true);

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        table.setFont(new Font("Arial", Font.BOLD, 16));
        JScrollPane jsp = new JScrollPane(table);
        table.setRowHeight(25);
        jsp.setBounds(10, 40, 580, 380);
        jsp.setVisible(true);
        jpn.add(jsp);

        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
        table.setRowSorter(sorter);

        for (int i = 0; i < col.length; i++) {
            tableModel.addColumn(col[i]);
        }

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        DefaultTableCellRenderer left = new DefaultTableCellRenderer();

        center.setHorizontalAlignment(SwingConstants.CENTER);
        right.setHorizontalAlignment(SwingConstants.RIGHT);
        left.setHorizontalAlignment(SwingConstants.LEFT);

        for (int i = 0; i < width.length; i++) {
            if (pos[i].equals("center")) {
                pos[i] = center;
            }
            if (pos[i].equals("right")) {
                pos[i] = right;
            }
            if (pos[i].equals("left")) {
                pos[i] = left;
            }

            table.getColumnModel().getColumn(i).setMaxWidth(Integer.parseInt(width[i].toString())
            );
            
            table.getColumnModel().getColumn(i).setResizable(true);

            table.getColumnModel().getColumn(i).setCellRenderer(
                    (TableCellRenderer) pos[i]);

        }

        return table;
    }
}
